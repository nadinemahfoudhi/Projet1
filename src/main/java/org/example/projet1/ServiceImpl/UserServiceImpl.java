package org.example.projet1.ServiceImpl;



import org.example.projet1.Entities.User;
import org.example.projet1.Repository.UserRep;
import org.example.projet1.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRep userRep;


    @Override
    public User AddUser(User user) {
        return userRep.save(user);
    }

    @Override
    public List<User> GetUsers() {
        return userRep.findAll();
    }
}
