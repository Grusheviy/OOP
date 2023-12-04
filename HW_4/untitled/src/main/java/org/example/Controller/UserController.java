package org.example.Controller;

import org.example.Model.User;

public interface UserController <T extends User> {
    void create(String firstName, String secondName, String lastName);

}
