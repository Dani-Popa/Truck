package ro.sci.domain;

public class Truck {
    private int truckID;
    private int serialNumber;
    private String producer;

    public Truck() {
    }

    public Truck(int truckID, int serialNumber, String producer) {
        this.truckID = truckID;
        this.serialNumber = serialNumber;
        this.producer = producer;
    }

    public int getTruckID() {
        return truckID;
    }

    public void setTruckID(int truckID) {
        this.truckID = truckID;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
