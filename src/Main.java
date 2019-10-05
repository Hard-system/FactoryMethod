public class Main {

    public static void main(String[] args) {
       Transport transport = TransportFactory.getTransportPrice("car");
        transport.costs();

        transport = TransportFactory.getTransportPrice("plane");
        transport.costs();

        transport = TransportFactory.getTransportPrice("train");
        transport.costs();
    }
}
