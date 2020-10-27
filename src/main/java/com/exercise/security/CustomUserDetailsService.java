package com.exercise.security;

import com.exercise.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDAO dao;

    @Override
    public UserDetails loadUserByUsername(String user_id) throws UsernameNotFoundException {
        System.out.println(user_id);
        CustomUserDetails users = new CustomUserDetails();
        try{
            users = dao.getUserById(user_id);
            System.out.println("id : " + user_id);
        }catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }
}
