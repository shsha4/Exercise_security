package com.exercise.dao;

import com.exercise.model.UserVO;
import com.exercise.security.CustomUserDetails;

public interface UserDAO {
    int insertUser(UserVO user) throws Exception;
    CustomUserDetails getUserById(String user_id) throws Exception;
}
