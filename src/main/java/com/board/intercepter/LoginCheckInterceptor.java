package com.board.intercepter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
public class LoginCheckInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(
			HttpServletRequest  request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception {
		
		// 1. session 에서 회원정보 검색
		HttpSession session     = request.getSession();
		Object      obj         = session.getAttribute("login");
		// UserVo error 이유: obj타입은 모든 클래스가 부모클래스 -> 넣기 위해 타입변환 필요 session앞에
		// UserVo 대신 obj (세션에 로그인이 있나 없나가 중요) = testing 노필요
		
		// 요청한 주소정보 확인
		String      requestUrl  = request.getRequestURL().toString();
		
		// /login page는 check에서 제외
		// Inteface 설정하는 곳에서 해당경로를 제외할 때 if() 필요x -> 로그인 제외할 것들을 넣음
		// if(requestUrl.contains("/login") ) {  // 
		//	return true;  // login check 중단
		// }
		
		if(obj == null) {
			// login 되어 있지 않다면 /loginForm 으로 이동  ** 핵심 (이걸 위해 만듦)
			response.sendRedirect("/loginForm");
			return false;   //
		}
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	

}
