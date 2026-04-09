package model;

// Inheritance
public class TiketEkonomi extends Tiket {

    public TiketEkonomi(String kodeBooking, String namaPenumpang, String tujuan, String Tgl, double harga) {
        super(kodeBooking, namaPenumpang, tujuan, Tgl, harga);
    }
//tugas pertemuan 3
    // Polymorphism
    @Override
    public double hitungHarga() {
        return harga;
    }

    @Override
    public String getJenisTiket() {
        return "Ekonomi";
    }
}