package edu.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberVOTest {

	@Test
	void testMemberVO() {
		MemberVO memberVO = new MemberVO();
//		System.out.println(memberVO);
		
		memberVO.setAge(10);
		memberVO.setName("홍길동");

		assertNotNull(memberVO);
//		assertEquals(memberVO.getAge(), 0);
		assertEquals(memberVO.getAge(), 10);
		assertEquals(memberVO.getName(), "홍길동");
		assertTrue(memberVO.getName().equals("홍길동"));
	}
	@Test
	void testMemberArgs() {
		MemberVO memberVO = 
				new MemberVO("홍길동","abcd","1234","email@email",10);
		
		System.out.println(memberVO);
	}
}
