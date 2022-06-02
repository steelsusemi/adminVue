//package com.jjp.admin.service.impl;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.jjp.admin.aop.LoggerAspect;
//import com.jjp.admin.comm.vo.CustomUserDetails;
//import com.jjp.admin.dao.UserAuthDAO;
//import com.jjp.admin.vo.UserVo;
//
//@Service("customUserDetailsServiceImpl")
//public class CustomUserDetailsServiceImpl {
//	private static final Logger log = LoggerFactory.getLogger(LoggerAspect.class);
//	
//	@Autowired
//    private UserAuthDAO userAuthDAO;
// 
//    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//    	UserVo userAuthes = (UserVo) userAuthDAO.loadUserByUsername(username);
//		
//		if(userAuthes == null) {
//			throw new UsernameNotFoundException("User "+username+" Not Found!");
//		}
//		
//		return new CustomUserDetails(userAuthes);
//    }
//
//}
