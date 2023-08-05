package oop;

public abstract class Card {
    String cardholder;
    int balance;
    String cardNumber;
    PaymentSystem paymentSystem;

    abstract void payInCountry (Country country, int amount)


}
