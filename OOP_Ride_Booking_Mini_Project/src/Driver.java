public class Driver {
    private final int driverId;
    private final String name;
    private final String vehicleNumber;
    private final String vehicleType;

    public Driver(int driverId, String name, String vehicleNumber, String vehicleType) {
        this.driverId = driverId;
        this.name = name;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public int getDriverId() { return driverId; }
    public String getName() { return name; }
    public String getVehicleNumber() { return vehicleNumber; }
    public String getVehicleType() { return vehicleType; }
}
