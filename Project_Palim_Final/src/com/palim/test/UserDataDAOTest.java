package com.palim.test;
import java.util.HashMap;
import java.util.Map;

import com.palim.dao.UserDataDAO;

public class UserDataDAOTest {
	public static void main(String[] args) {
		UserDataDAO dao = new UserDataDAO();
		Map<String, String> inputData = new HashMap<String, String>();
		inputData.put("userID", "1212");
		inputData.put("password", "1212");
		inputData.put("nickname", "1212");
		inputData.put("phone", "010123412345");
		inputData.put("alarm", "B");
		
		Map<String, String> inputData2 = new HashMap<String, String>();
		inputData2.put("password", "1234");
		inputData2.put("userID", "3124123!#@!@lawawe.efew");
		
		Map<String, String> inputData3 = new HashMap<String, String>();
		inputData3.put("phone", "1212");
		inputData3.put("userID", "1212");
		
		Map<String, String> inputData4 = new HashMap<String, String>();
		inputData4.put("nickname", "1234");
		inputData4.put("userID", "3124123!#@!@lawawe.efew");
		
		Map<String, String> inputData5 = new HashMap<String, String>();
		inputData5.put("alarm", "B");
		inputData5.put("userID", "1212");
		
		
		//System.out.println(dao.addMember(inputData));
		//System.out.println(dao.checkID("bok0502@naver.com"));
		//System.out.println(dao.checkValidID("1212"));
		//System.out.println(dao.checkNickname("1212"));
		//System.out.println(dao.checkPhone("1212"));
		//System.out.println(dao.informID("1212"));
		//System.out.println(dao.updatePW(inputData2));
		//System.out.println(dao.login(inputData2));
		//System.out.println(dao.checkPW(inputData2));
		//System.out.println(dao.dropUser("1212"));
		//System.out.println(dao.updatePhone(inputData3));
		//System.out.println(dao.updateNickname(inputData4));
		//System.out.println(dao.updateAlarm(inputData5));
		
		/*HashMap<String, String> hashmap=new HashMap();
		hashmap.put("userID", "bok0515@naver.com"); 
		hashmap.put("password", "123456");
		hashmap.put("nickname", "가가가");
		hashmap.put("phone", "01011112222");
		hashmap.put("alarm", "M");*/
		
		
		/**회원가입(회원가입)*/
		//System.out.println(dao.addMember(hashmap));
		
		/**회원가입(아이디중복체크)*/
		//System.out.println(dao.checkID("bok0503@naver.com"));//원래 있는 값
		//System.out.println(dao.checkID("bok@naver.com"));//원래 없는 값
		
		/**비밀번호 찾기(아이디 확인)*/
		//System.out.println(dao.checkValidID("bok0503@naver.com"));//원래 있는 값
		//System.out.println(dao.checkValidID("bok@naver.com"));//원래 없는 값
		
		/**회원가입(닉네임 중복체크), 회원정보수정(닉네임 중복체크)*/
		//System.out.println(dao.checkNickname("뽁뽁이"));//원래 있는 값
		//System.out.println(dao.checkNickname("복복복"));//원래 없는 값
		
		
		/**회원가입, 아이디찾기, 비밀번호찾기(휴대폰번호 중복체크)*/
		//System.out.println(dao.checkPhone("01012345672"));//원래 있는 값
		//System.out.println(dao.checkPhone("1234567"));//원래 없는 값
		
		/**아이디찾기(아이디 알려주기)*/
		//System.out.println(dao.informId("01012345672"));//원래 있는 값
		//System.out.println(dao.informId("111"));//원래 없는 값
		
		/**비밀번호 찾기-비밀번호 재설정+(회원정보수정)*/ 
		/*HashMap<String, String> updatePWHashMap=new HashMap();
		updatePWHashMap.put("password", "01054837330");
		updatePWHashMap.put("userID", "bok0502@naver.com");
		
		System.out.println(dao.updatePW(updatePWHashMap));*/
		
		/**로그인*/
		/*HashMap<String, String> loginHashMap=new HashMap();
		loginHashMap.put("userID", "bok0502@naver.com");
		loginHashMap.put("password", "01054837330");
		System.out.println(dao.login(loginHashMap));*/
		
		/**회원탈퇴-비밀번호 확인*/
		/*HashMap<String, String> checkPWHashMap=new HashMap();
		checkPWHashMap.put("userID", "bok0502@naver.com");
		checkPWHashMap.put("password", "01054837330");
		
		System.out.println(dao.checkPW(checkPWHashMap));*/
		
		/**회원탈퇴-flag변경*/
		//System.out.println(dao.changeDropFlag("bok0510@naver.com"));
		
		/**휴대폰번호 수정*/
		/*HashMap<String, String> updatePhoneHashMap=new HashMap();
		updatePhoneHashMap.put("phone", "01089212459");
		updatePhoneHashMap.put("userID", "bok0504@naver.com");
		System.out.println(dao.updatePhone(updatePhoneHashMap));*/
		
		/**닉네임 수정*/
		/*HashMap<String, String> updateNicknameHashMap=new HashMap();
		updateNicknameHashMap.put("userID", "bok0502@naver.com");
		updateNicknameHashMap.put("nickname", "강아지");
		System.out.println(dao.updateNickname(updateNicknameHashMap));*/		
		
		/**알림방법 수정*/
		/*HashMap<String, String> updateAlarmHashMap=new HashMap();
		updateAlarmHashMap.put("alarm", "B");
		updateAlarmHashMap.put("userID", "bok0502@naver.com");
		System.out.println(dao.updateAlarm(updateAlarmHashMap));*/
		
		System.out.println("end");

	}
}
