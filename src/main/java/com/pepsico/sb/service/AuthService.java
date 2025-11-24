package com.pepsico.sb.service;

import com.pepsico.sb.entity.User;
import com.pepsico.sb.model.LoginRequest;
import com.pepsico.sb.model.LoginResponse;
import com.pepsico.sb.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoginResponse login(LoginRequest request) {

        User user = userRepository.findById(request.getEmail()).orElse(null);

        if (user == null) {
            return new LoginResponse(false, "User not found");
        }

        if (!user.getPassword().equals(request.getPassword())) {
            return new LoginResponse(false, "Invalid password");
        }

        return new LoginResponse(true, "Login successful");
    }
}