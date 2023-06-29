package edu.greenjack.usermanager.service;

import edu.greenjack.usermanager.model.User;

import java.util.List;

public interface UsersService {
    List<User> findAll();
    User findById(long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
}
