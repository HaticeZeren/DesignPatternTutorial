package structural.design.patterns.adapter;

public class OldPaymentSystem implements PaymentSystem {
    @Override
    public void payWithCreditCard(String cardNumber, double amount) {
        System.out.println(cardNumber + " Kredi kartı ile ödeme yapıldı");
    }
}
