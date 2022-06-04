package com.iSystem.CertificateService.controller;

import com.iSystem.CertificateService.model.User;
import com.iSystem.CertificateService.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(params = ("/api/v1/user"))
public class UserController {
    private UserService userService;

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody User user){
        boolean result = userService.create(user);
        return ResponseEntity.ok(result);
    }

    @GetMapping(params = ("/getAll"))
    public ResponseEntity<?> getAll(){
        List<User> result = userService.getAll();
        return ResponseEntity.ok(result);
    }
}
