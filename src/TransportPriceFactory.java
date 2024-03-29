public class TransportPriceFactory {

    public static TransportPrice getTransportPrice(String transport) {
        if (transport.equalsIgnoreCase("car")) {
            return new Car();
        }
        if (transport.equalsIgnoreCase("plane")) {
            return new Plane();
        }
        if (transport.equalsIgnoreCase("train")) {
            return new Train();
        }
        return null;
    }
}
