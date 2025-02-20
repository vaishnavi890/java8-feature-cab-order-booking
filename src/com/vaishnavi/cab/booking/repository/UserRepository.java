package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.User;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }

    public Optional<User> getUserById(int userId) {
        return users.stream().filter(user -> user.getUserId() == userId).findFirst();
    }

    public void removeUser(int userId) {
        users.removeIf(user -> user.getUserId() == userId);
    }
}

