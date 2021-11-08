package com.jjp.admin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jjp.admin.vo.UserVo;

@Repository
public class UserAuthDAO {
	
	private String NAME_SPACE = "com.jjp.admin.dao.UserAuthDAO.";
	
	@Autowired
    private SqlSessionTemplate sqlSession;
 
    public UserVo loadUserByUsername(String username) {
        return sqlSession.selectOne(NAME_SPACE + "selectUserById", username);
    }
}
