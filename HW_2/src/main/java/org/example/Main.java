package org.example;

public class Main {
    public static void main(String[] args) {

        Market market = new Market();
        Human human1 = new Human("Human_1");
        Human human2 = new Human("Human_2");
        market.AcceptToMarket(human1);
        market.Update();
        market.AcceptToMarket(human2);
        market.Update();
    }
}