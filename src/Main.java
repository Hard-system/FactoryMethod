import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String typeTransport = "";
        try {
            typeTransport = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        TransportPrice transport = TransportPriceFactory.getTransportPrice(typeTransport);
        transport.costs();

    }
}
