public class Bicycle implements Transport {
    private final double ratePerKm = 0.2;
    private final double speed = 15;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        if (passengers > 1) {
            System.out.println("⚠️ Bicycle yalnız 1 nəfərlikdir!");
        }
        return calculateFare(distance);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Bicycle - rate: " + ratePerKm + " ₼/km, speed: " + speed + " km/h";
    }
}
