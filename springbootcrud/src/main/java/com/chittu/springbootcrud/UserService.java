package com.chittu.springbootcrud;
import java.util.List;

import org.springframework.stereotype.Service;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}