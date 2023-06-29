package edu.greenjack.usermanager.dao;

import edu.greenjack.usermanager.model.User;

import java.util.List;

public interface UsersDao {
    List<User> findAll();
    User findById(long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
}
