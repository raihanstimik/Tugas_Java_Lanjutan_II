package payment;

// Polymorphism
public class Transfer implements Pembayaran {

    @Override
    public String getMetode() {
        return "Transfer";
    }
}