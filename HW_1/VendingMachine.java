import java.util.List;

public interface VendingMachine {
    public void initHotdrink(List<HotDrink> HotdrinkList);
    public HotDrink getHotdrink(String name);
}
