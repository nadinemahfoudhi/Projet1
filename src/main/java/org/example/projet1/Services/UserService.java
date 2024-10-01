package org.example.projet1.Services;


import org.example.projet1.Entities.User;

import java.util.List;

public interface UserService {
    User AddUser(User user);
    List<User> GetUsers();
}
