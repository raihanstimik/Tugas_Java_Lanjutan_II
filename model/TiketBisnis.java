package model;

// Inheritance
public class TiketBisnis extends Tiket {

    public TiketBisnis(String kodeBooking, String namaPenumpang, String tujuan, String Tgl, double harga) {
        super(kodeBooking, namaPenumpang, tujuan, Tgl, harga);
    }

    // Polymorphism
    @Override
    public double hitungHarga() {
        return harga + 75000;
    }

    @Override
    public String getJenisTiket() {
        return "Bisnis";
    }
}