public class Main {

    public static void main(String[] args) {
       Transport transport = TransportPriceFactory.getTransportPrice("car");
        transport.costs();

        transport = TransportPriceFactory.getTransportPrice("plane");
        transport.costs();

        transport = TransportPriceFactory.getTransportPrice("train");
        transport.costs();
    }
}
