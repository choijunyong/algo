package com.palim.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.palim.dao.UserDataDAO;

public class UserDataDAOJUnitTest {
	static UserDataDAO dao;
	
	@BeforeClass
	public static void DAO_생성자() throws Exception{
		dao = new UserDataDAO();
	}
	@Test
	public void 회원가입() {
		assertTrue(dao.addMember("bok0501@naver.com", "jejuisland", "복실이", "01011234567", "B"));
	}
	
	@Test
	public void 로그인(){
		assertNotNull(dao.login("bok0503@naver.com", "jejuisland2"));
	}
	
	@Test
	public void 아이디_중복확인_비밀번호찾기_본인확인(){
		assertTrue(dao.checkID("bok0515@naver.com"));
	}
	
	@Test
	public void 가입된_유저_비밀번호_찾기(){
		assertTrue(dao.checkValidID("bok0507@naver.com"));
	}
	
	@Test
	public void 닉네임_중복확인(){
		assertTrue(dao.checkNickname("복실이"));
	}
	
	@Test
	public void 폰_번호_중복확인(){
		assertTrue(dao.checkPhone("01012345671"));
	}
	
	@Test 
	public void 아이디_찾기(){
		assertEquals(dao.informID("01012345671"), "bok0502@naver.com");
	}
 
	@Test
	public void 회원정보_수정시_탈퇴시_본인확인(){
		assertTrue(dao.checkPW("bok0502@naver.com", "jejuland1"));	
	}
	
	@Test
	public void 비밀번호_수정(){
		assertTrue(dao.updatePW("jejuland1", "bok0502@naver.com"));
	}
	
	@Test 
	public void 폰번호_수정(){
		assertTrue(dao.updatePhone("01012345671", "bok0502@naver.com"));
	}
	
	@Test
	public void 닉네임수정(){
		assertTrue(dao.updateNickname("복실이1", "bok0502@naver.com"));
	}
	
	@Test
	public void 알림방법_수정(){
		assertTrue(dao.updateAlarm("T", "bok0502@naver.com"));
	}
	
	@Test
	public void 회원탈퇴(){
		assertTrue(dao.dropUser("bok0501@naver.com", "jejuisland1"));
	}
}


