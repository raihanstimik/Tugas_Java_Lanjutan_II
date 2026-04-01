package model;

// Abstraction
public abstract class Tiket {

    // Encapsulation
    private String kodeBooking;
    private String namaPenumpang;
    private String tujuan;
    private String Tgl;
    protected double harga;

    public Tiket(String kodeBooking, String namaPenumpang, String tujuan, String Tgl, double harga) {
        this.kodeBooking = kodeBooking;
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
        this.Tgl = Tgl;
        this.harga = harga;
    }

    // Encapsulation 
    public String getKodeBooking() { return kodeBooking; }
    public String getNamaPenumpang() { return namaPenumpang; }
    public String getTujuan() { return tujuan; }
    public String getTgl() { return Tgl; }

    // Abstraction
    public abstract double hitungHarga();
    public abstract String getJenisTiket();
}