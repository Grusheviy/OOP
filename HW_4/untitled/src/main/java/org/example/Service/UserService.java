package org.example.Service;

import org.example.Model.User;
public interface UserService <T extends User> {
    void create(String firstName, String secondName, String lastName);
}
