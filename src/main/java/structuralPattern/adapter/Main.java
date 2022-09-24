package structuralPattern.adapter;

public class Main {
    public static void main(String[] args) {

        UsaCharger socket = new UsaCharger();
        socket.chargeUsaPhone();
        UsaCharger usaSocketAdapter = new SocketAdapter(new RomanianCharger());
        usaSocketAdapter.chargeUsaPhone();


    }
}
