package service;

import model.Tiket;
import payment.Pembayaran;

public class TiketService {

    // Method untuk tampilkan invoice
    public void tampilkanInvoice(Tiket t, Pembayaran metode) {

        System.out.println("INVOICE TIKET KERETA API");
        System.out.println("Kode Booking      : " + t.getKodeBooking());
        System.out.println("Nama              : " + t.getNamaPenumpang());
        System.out.println("Tujuan, Tgl/Waktu : " + t.getTujuan() + ", " + t.getTgl());
        System.out.println("Jenis Tiket       : " + t.getJenisTiket());
        System.out.println("Metode Pembayaran : " + metode.getMetode());
        System.out.printf("Harga             : Rp %,.0f\n", t.hitungHarga());
    }
}