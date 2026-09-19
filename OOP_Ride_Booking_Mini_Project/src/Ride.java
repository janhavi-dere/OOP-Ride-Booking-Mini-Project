public class Ride {
    private final int rideId;
    private final Rider rider;
    private final Driver driver;
    private final double distanceKm;
    private final String rideType;
    private final double fare;

    public Ride(int rideId, Rider rider, Driver driver, double distanceKm, String rideType, double fare) {
        this.rideId = rideId;
        this.rider = rider;
        this.driver = driver;
        this.distanceKm = distanceKm;
        this.rideType = rideType;
        this.fare = fare;
    }

    public void displayRideDetails() {
        System.out.println("\n========== RIDE DETAILS ==========");
        System.out.println("Ride ID      : " + rideId);
        System.out.println("Rider        : " + rider.getName());
        System.out.println("Phone        : " + rider.getPhoneNumber());
        System.out.println("Driver       : " + driver.getName());
        System.out.println("Vehicle      : " + driver.getVehicleNumber());
        System.out.println("Vehicle Type : " + driver.getVehicleType());
        System.out.println("Ride Type    : " + rideType);
        System.out.printf("Distance     : %.2f km%n", distanceKm);
        System.out.printf("Fare         : Rs. %.2f%n", fare);
        System.out.println("==================================");
    }
}
