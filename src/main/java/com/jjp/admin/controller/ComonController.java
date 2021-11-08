package com.jjp.admin.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jjp.admin.comm.vo.CustomUserDetails;
import com.jjp.admin.vo.UserVo;

@Controller
public class ComonController {
	private static final Logger log = LoggerFactory.getLogger(ComonController.class);
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/main")
    public String main(HttpServletRequest request, HttpServletResponse respose, Authentication authentication, Model model) throws IOException {
    	log.info("###################[ Main Page 이동]###################");
//    	if(true) {
//    		throw new CustomException(ErrorCode.TEMPORARY_SERVER_ERROR);
//    	}
    	
    	log.info("authentication : " + authentication);
    	if (authentication != null) {
			log.info("타입정보 : " + authentication.getClass());
			
			// 세션 정보 객체 반환
			WebAuthenticationDetails web = (WebAuthenticationDetails)authentication.getDetails();
			log.info("세션ID : " + web.getSessionId());
			log.info("접속IP : " + web.getRemoteAddress());

			
			// UsernamePasswordAuthenticationToken에 넣었던 UserDetails 객체 반환
			CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
//			log.info("ID정보 : " + userDetails.getUserVo().get(0).getUserId()); 
			log.info("ID정보 : " + userDetails.getUserVo().getUserId()); 
			
			HttpSession sessInfo = request.getSession();
			UserVo userVo = (UserVo) sessInfo.getAttribute("userInfo");
			log.info("ID정보 : " + userVo); 
			if(userVo == null && request.getRequestURI().equals("/main")) {
				sessInfo.setAttribute("userInfo", userDetails.getUserVo());
				sessInfo.setMaxInactiveInterval(300);  // 60초
//				sessInfo.invalidate();
			}
			
			log.info("세션 정보 : " + sessInfo.getAttribute("userInfo")+" : "+request.getRequestURI());
		}
    	
//    	UserVo userInfo = (UserVo) request.getSession().getAttribute("userInfo");
//    	if(userInfo == null) {
//    		
//    	}
    	
        return "user/main";
    }
}
