package Model;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    //Реализация Open/Closed Principle
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = compareAdditionalFields(o1, o2);
        }

        return resultOfComparing;
    }

    //Теперь этот метод можно переопределять в подклассах, если необходимо сравнить дополнительные поля.
    protected int compareAdditionalFields(T o1, T o2) {
        return 0;
    }
}
