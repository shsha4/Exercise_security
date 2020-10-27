package com.exercise.dao;

import com.exercise.model.UserVO;
import com.exercise.security.CustomUserDetails;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public int insertUser(UserVO user) throws Exception {
        return sqlSession.insert("insertUser", user);
    }

    @Override
    public CustomUserDetails getUserById(String user_id) throws Exception {
        return sqlSession.selectOne("getUserById", user_id);
    }
}
