package oop;

public class UnionPayCard extends Card{
    public UnionPayCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    public void payInCountry(Country country, int amount) {

    }

    protected boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.CN)
            return true;
        else
            return false;
    }
}
