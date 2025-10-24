public class Taxi implements Transport {
    private final double ratePerKm = 1.5;
    private final double speed = 60;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        return calculateFare(distance) * (1 + (passengers - 1) * 0.2);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Taxi - rate: " + ratePerKm + " ₼/km, speed: " + speed + " km/h";
    }
}