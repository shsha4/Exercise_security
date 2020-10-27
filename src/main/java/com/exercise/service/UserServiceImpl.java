package com.exercise.service;

import com.exercise.dao.UserDAO;
import com.exercise.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO dao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public int insertUser(UserVO user) {
        System.out.println(user.getUser_id());
        System.out.println(user.getUser_name());
        int result = 0;
        try {
            user.setUser_pw( bCryptPasswordEncoder.encode(user.getUser_pw()));
            System.out.println("service : " + user.toString());
            result = dao.insertUser(user);
            System.out.println("service : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
