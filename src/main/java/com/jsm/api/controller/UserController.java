package com.jsm.api.controller;

import com.dropstat.api.exception.CustomException;
import com.jsm.api.service.UserService;
import com.jsm.api.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Map<String, Object>> signup (@RequestBody UserVO request){
        if (null == request.getUsername()) throw new CustomException("Username can't be  null", HttpStatus.BAD_REQUEST);
        if (null == request.getPassword()) throw new CustomException("password can't be  null", HttpStatus.BAD_REQUEST);

        userService.createUser(request);

        Map<String, Object> response = new HashMap<>();
        response.put("message", "user created successfully");
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }

}
