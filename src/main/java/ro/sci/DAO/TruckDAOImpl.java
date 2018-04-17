package ro.sci.DAO;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ro.sci.domain.Truck;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TruckDAOImpl implements TruckDAO{

    private JdbcTemplate jdbcTemplate;


    public TruckDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Truck> getAll() {
        return jdbcTemplate.query("select * from truck", new RowMapper<Truck>() {
            @Override
            public Truck mapRow(ResultSet resultSet, int i) throws SQLException {

                Truck result = new Truck();
                result.setTruckID(resultSet.getInt(3));
                result.setSerialNumber(resultSet.getInt(2));
                result.setProducer(resultSet.getString(1));
                return result;
            }
        });
    }

    @Override
    public Truck create(Truck c) {
        jdbcTemplate.update("insert into truck(truckID, serialNumber, producer) values(?, ?, ?)",
                c.getTruckID(), c.getSerialNumber(),c.getProducer());
        return c;
    }

    @Override
    public Truck update(Truck c) {
        return null;
    }
}
