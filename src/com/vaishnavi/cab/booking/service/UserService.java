package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.User;
import com.vaishnavi.cab.booking.repository.UserRepository;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public void registerUser(User user) {
        userRepository.addUser(user);
    }

    public void listUsers() {
        userRepository.getAllUsers().forEach(user -> System.out.println(user.getName()));
    }

    public User findUserById(int userId) {
        return userRepository.getUserById(userId).orElse(null);
    }

    public void deleteUser(int userId) {
        userRepository.removeUser(userId);
    }
}
