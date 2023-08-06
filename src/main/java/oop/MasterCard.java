package oop;

public class MasterCard extends Card{

    public MasterCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    public void payInCountry(Country country, int amount) {

    }

    protected boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
