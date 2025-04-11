package structural.design.patterns.adapter;

public class Main {
    public static void main(String[] args) {

        // Eski sistemdeki ödeme işlemini yapalım
        PaymentSystem paymentSystem = new OldPaymentSystem();
        paymentSystem.payWithCreditCard("12345",1000);

        // Eski sistemdeki ödeme işlemini yeni sisteme adapte ediyoruz
        NewPaymentSystem newPaymentSystem = new NewPaymentSystem();
        paymentSystem = new PaymentAdapter(newPaymentSystem);
        paymentSystem.payWithCreditCard("12345",1000);
    }
}