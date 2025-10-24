public class Bus implements Transport {
    private final double ratePerKm = 0.5;
    private final double speed = 40;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        double baseFare = calculateFare(distance);
        return baseFare * Math.max(1, passengers * 0.8);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Bus - rate: " + ratePerKm + " ₼/km, speed: " + speed + " km/h";
    }
}