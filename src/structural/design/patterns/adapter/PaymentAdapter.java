package structural.design.patterns.adapter;

public class PaymentAdapter implements PaymentSystem{

    private final NewPaymentSystem newPaymentSystem;

    public PaymentAdapter(NewPaymentSystem newPaymentSystem) {
        this.newPaymentSystem = newPaymentSystem;
    }

    @Override
    public void payWithCreditCard(String cardNumber, double amount) {
        // Kredi kartı numarasını banka hesabına dönüştürme
        String account = "BankAccount-" + cardNumber;
        newPaymentSystem.accountMakePayment(account,amount);
    }
}
