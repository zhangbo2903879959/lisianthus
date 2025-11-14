package com.example.yourapp.Service;

import com.example.yourapp.pojo.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User createUser(User user);
    boolean updateUser(Long id, User userDetails);
    boolean deleteUser(Long id);
    Optional<User> getUserByUsername(String username);
    List<User> getUsersByRole(String role);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}