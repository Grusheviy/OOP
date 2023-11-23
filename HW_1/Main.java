import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<HotDrink> HotDrinkList = new ArrayList<>();
        HotDrinkList.add(new HotDrinkWithTemperature("Tea", 250, 60));
        HotDrinkList.add(new HotDrinkWithTemperature("Americano", 250, 60));
        HotDrinkList.add(new HotDrinkWithTemperature("Americano", 500, 80));
        HotDrinkList.add(new HotDrinkWithTemperature("Russiano", 250, 100));
        HotDrinkList.add(new HotDrinkWithTemperature("Latte", 250, 40));
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initHotdrink(HotDrinkList);
        System.out.println("Received drink: " + vendingMachine.getHotdrink("Americano", 60));
    }
}
