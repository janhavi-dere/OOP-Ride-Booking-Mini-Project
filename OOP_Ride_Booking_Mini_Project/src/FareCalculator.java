public class FareCalculator {
    private static final double BASE_FARE = 40.0;
    private static final double RATE_PER_KM = 15.0;

    public double calculateFare(double distanceKm, String rideType) {
        double multiplier;
        switch (rideType.toLowerCase()) {
            case "bike": multiplier = 0.8; break;
            case "auto": multiplier = 1.0; break;
            case "car": multiplier = 1.4; break;
            default: multiplier = 1.0;
        }
        return BASE_FARE + (distanceKm * RATE_PER_KM * multiplier);
    }
}
