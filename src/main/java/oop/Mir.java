package oop;

public class Mir extends Card{
    public Mir(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    public void payInCountry(Country country, int amount) {
    }

    protected boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.RU)
            return true;
        else
            return false;
    }
}
