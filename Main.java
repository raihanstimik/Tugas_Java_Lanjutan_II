import model.Tiket;
import model.TiketEkonomi;
import service.TiketService;
import payment.Pembayaran;
import payment.Transfer;

public class Main {
    public static void main(String[] args) {

        TiketService service = new TiketService();

        Tiket tiket = new TiketEkonomi(
            "KA123",
            "Raihan",
            "Bandung - Jakarta",
            "2026-08-01, 08:00",
            45000
        );

        Pembayaran bayar = new Transfer();

        service.tampilkanInvoice(tiket, bayar);
    }
}