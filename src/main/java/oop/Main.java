package oop;

import oop.Card;
import oop.Country;
import oop.PaymentSystem;
import oop.VisaCard;

import static oop.Country.*;
import static oop.PaymentSystem.*;

public class Main {
    public static void main(String[] args) {
        Card visaCard = new VisaCard(VISA);
        visaCard.setBalance(100);
        System.out.println(visaCard.getPaymentSystem());
//        System.out.println(visaCard.isCountryValidForTheseCard(RU));

    }
}
