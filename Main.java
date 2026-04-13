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

        // Data tiket
        daftarTiket.add(new TiketEkonomi(
            "KA123", "Raihan", "Bandung - Jakarta", "2026-08-01, 08:00", 45000
        ));

        daftarTiket.add(new TiketBisnis(
            "KA125", "Raihan", "Bandung - Jakarta", "2026-08-01, 08:00", 100000
        ));

        // tampilkan daftar
        System.out.println("=== DAFTAR TIKET ===");
        for (int i = 0; i < daftarTiket.size(); i++) {
            Tiket t = daftarTiket.get(i);
            System.out.println((i + 1) + ". " + t.getTujuan() + " | " + t.getJenisTiket());
        }

        try {
            // input user
            System.out.print("Pilih tiket: ");
            int pilih = input.nextInt();

            // validasi pilihan
            if (pilih < 1 || pilih > daftarTiket.size()) {
                System.out.println("Pilihan tidak valid!");
            } else {
                Tiket tiketDipilih = daftarTiket.get(pilih - 1);

                Pembayaran bayar = new Transfer();

                service.tampilkanInvoice(tiketDipilih, bayar);
            }

        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}