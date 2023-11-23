import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrink> HotdrinkList = new ArrayList<>();
    @Override
    public void initHotdrink(List<HotDrink> HotdrinkList) {
        this.HotdrinkList = HotdrinkList;
    }

    @Override
    public HotDrink getHotdrink(String name) {
        for (HotDrink item : HotdrinkList)
            if (item.getName().equals(name))
                return item;
        return null;
    }

    public HotDrink getHotdrink(String name, int temperature) {
        for (HotDrink item : HotdrinkList)
            if (item.getName().equals(name) && ((HotDrinkWithTemperature) item).getTemperature() == temperature)
                return item;
        return null;
    }

    public HotDrink getHotDrink(int temperature) {
        for (HotDrink item : HotdrinkList)
            if (((HotDrinkWithTemperature) item).getTemperature() == temperature)
                return item;
        return null;
    }
}
