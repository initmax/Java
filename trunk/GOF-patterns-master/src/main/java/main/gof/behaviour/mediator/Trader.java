package main.gof.behaviour.mediator;

/**
 * Class uses transaction concept
 */
public class Trader {

    public void doTradeTransaction(String typeOfTransaction) {
        int expectedPriceSell = 320;
        Mediator mediator = new Mediator();
        mediator.doTransaction(typeOfTransaction, expectedPriceSell, "trader");
    }
}
