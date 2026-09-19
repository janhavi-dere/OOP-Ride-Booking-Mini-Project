public class Rider extends User {
    public Rider(int userId, String name, String phoneNumber) {
        super(userId, name, phoneNumber);
    }

    public void requestRide() {
        System.out.println(getName() + " requested a ride.");
    }
}
