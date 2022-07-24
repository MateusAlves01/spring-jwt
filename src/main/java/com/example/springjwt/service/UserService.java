package com.example.springjwt.service;

import com.example.springjwt.model.User;
import com.example.springjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private PasswordEncoder encoder;
    public void creatUser(User user){
        String pass = user.getPassword();
        //Criptografando
        user.setPassword(encoder.encode(pass));
        userRepository.save(user);
    }
}
