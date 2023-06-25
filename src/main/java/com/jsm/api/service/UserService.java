package com.jsm.api.service;

import com.jsm.api.model.Users;
import com.jsm.api.repository.UserRepository;
import com.jsm.api.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(UserVO request) {

        Users user = new Users();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setMobileNumber(request.getMobileNumber());
        user.setEmail(request.getEmail());

        userRepository.save(user);
    }
}
