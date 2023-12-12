package View;

import Model.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}