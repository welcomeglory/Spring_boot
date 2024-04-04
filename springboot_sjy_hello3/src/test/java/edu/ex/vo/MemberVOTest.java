package edu.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberVOTest {

	@Test
	void testMemberVO() {
		MemberVO memberVO = new MemberVO();
		System.out.println(memberVO);
		
		assertNotNull(memberVO);
		
	}

}
