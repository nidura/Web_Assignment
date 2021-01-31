package com.swlc.gadget.service;

import com.swlc.gadget.dto.User;
import com.swlc.gadget.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerNewUser(User user) {
        return userRepository.save(user);
    }

    public User updateUserProfile(User user) {
        return userRepository.save(user);
    }

    public Boolean deactiveUserProfile(int userId) {
        Optional<User> user = userRepository.findById(userId);
        user.get().setStatus("DEACTIVATED");
        userRepository.save(user.get());
        return true;
    }
}
