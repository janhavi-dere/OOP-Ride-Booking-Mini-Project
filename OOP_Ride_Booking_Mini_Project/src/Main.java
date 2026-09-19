import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("       OOP RIDE BOOKING APP       ");
        System.out.println("==================================");

        System.out.print("Enter rider name: ");
        String riderName = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        Rider rider = new Rider(101, riderName, phone);
        Driver driver = new Driver(201, "Rahul Patil", "MH12AB1234", "Sedan");

        System.out.print("Enter ride type (bike/auto/car): ");
        String rideType = scanner.nextLine();

        System.out.print("Enter distance in km: ");
        double distance = scanner.nextDouble();

        if (distance <= 0) {
            System.out.println("Distance must be greater than zero.");
            scanner.close();
            return;
        }

        rider.requestRide();
        FareCalculator calculator = new FareCalculator();
        double fare = calculator.calculateFare(distance, rideType);

        Ride ride = new Ride(501, rider, driver, distance, rideType, fare);
        ride.displayRideDetails();
        scanner.close();
    }
}
