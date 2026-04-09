import java.util.*;

import model.Tiket;
import model.TiketEkonomi;
import model.TiketBisnis;
import service.TiketService;
import payment.Pembayaran;
import payment.Transfer;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TiketService service = new TiketService();

        List<Tiket> daftarTiket = new ArrayList<>();

// Tiket Ekonomi
daftarTiket.add(new TiketEkonomi(
    "KA123", "Raihan", "Bandung - Jakarta", "2026-08-01, 08:00", 45000
));

// Tiket Bisnis
daftarTiket.add(new TiketBisnis(
    "KA125", "Raihan", "Bandung - Surabaya", "2026-08-03, 10:00", 100000
));

        // ===============================
        // TAMPILKAN DAFTAR
        // ===============================
        System.out.println("=== DAFTAR TIKET ===");
        for (int i = 0; i < daftarTiket.size(); i++) {
            Tiket t = daftarTiket.get(i);
            System.out.println((i+1) + ". " + t.getTujuan() + " | " + t.getJenisTiket());
        }

        // ===============================
        // PILIH
        // ===============================
        System.out.print("Pilih tiket: ");
        int pilih = input.nextInt();

        Tiket tiketDipilih = daftarTiket.get(pilih - 1);

        // ===============================
        // PEMBAYARAN
        // ===============================
        Pembayaran bayar = new Transfer();

        // ===============================
        // OUTPUT
        // ===============================
        service.tampilkanInvoice(tiketDipilih, bayar);

        input.close();
    }
}