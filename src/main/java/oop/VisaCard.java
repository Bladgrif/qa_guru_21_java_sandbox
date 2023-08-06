package oop;

public class VisaCard extends Card{
    public VisaCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    public void payInCountry(Country country, int amount) {
        if (isCountryValidForTheseCard(country)) {
            if (balance >= amount) {
                balance = balance - amount;
                System.out.println("Accepted");
            }
        }

    }

    protected boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
