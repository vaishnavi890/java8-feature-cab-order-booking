package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.User;
import com.vaishnavi.cab.booking.service.UserService;
;
public class UserController {
    private UserService userService = new UserService();

    public void registerUser(User user) {
        userService.registerUser(user);
    }

    public void displayUsers() {
        userService.listUsers();
    }

    public void getUserDetails(int userId) {
        User user = userService.findUserById(userId);
        if (user != null) {
            System.out.println("User found: " + user.getName());
        } else {
            System.out.println("User not found");
        }
    }

    public void deleteUser(int userId) {
        userService.deleteUser(userId);
        System.out.println("User deleted successfully");
    }
}
