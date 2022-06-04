package com.iSystem.CertificateService.service;

import com.iSystem.CertificateService.model.User;
import com.iSystem.CertificateService.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public boolean create(User user) {
        userRepository.save(user);
        return true;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
