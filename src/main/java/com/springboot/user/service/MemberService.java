package com.springboot.user.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.user.vo.MemberVO;


public interface MemberService {
	
	/**
	 * 아이디, 패스워드로 회원 조회
	 * @param memberVO
	 * @throws Exception
	 */
	MemberVO selectMemberByIdByPw(MemberVO memberVO) throws Exception;
	
}
