package com.palim.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.palim.dao.HopeDataDAO;

public class HopeDataDAOJunitTest {
	static HopeDataDAO dao2;
	@BeforeClass
	public static void DAO_생성자() throws Exception {
		dao2=new HopeDataDAO();
	}
	@Test
	public void 희망목록_추가() {
		assertTrue(dao2.addHopeList("121700", "https://shopping-phinf.pstatic.net/main_8027651/80276514524.jpg","http://shopping.naver.com/gate.nhn?id=80276514524","DJI 텔로 <b>드론</b> TELLO DRONE", 50000, "bok0502@naver.com"));
	}
	
	@Test
	public void 날짜별_최저가_업데이트() {
		assertTrue(dao2.addLowPricePerDay(500000, 52, 1));
	}
	
	@Test
	public void 희망목록_중복제품_체크() {
		assertTrue(dao2.checkDuplicateHopeProduct("bok0502@naver.com", "8198816799"));
	}
	
	@Test
	public void 오늘_최저가_모음() {
		assertNotNull(dao2.getAllHopeListToday());
	}
	
	@Test
	public void 어제_최저가_모음() {
		assertNotNull(dao2.getAllHopeListYesterday());
	}
	
	@Test
	public void 희망가_수정() {
		assertTrue(dao2.updateHopePrice("600000", "8198816799", "bok0502@naver.com"));
	}
	
	@Test
	public void 희망목록_삭제() {
		assertTrue(dao2.deleteHopeProduct("8198816799", "bok0502@naver.com"));
	}
	
	@Test
	public void 처음_최저가() {
		assertNotNull(dao2.getLowPriceFirstDay("8198816799", "bok0502@naver.com"));
	}
	
	@Test
	public void 등록순() {
		assertNotNull(dao2.orderByRegistrationPage("bok0502@naver.com", 1));
	}
	
	@Test
	public void 최신등록순() {
		assertNotNull(dao2.orderByRegistrationDescPage("bok0502@naver.com", 1));
	}
	
	@Test
	public void 최저가순() {
		assertNotNull(dao2.orderByLpricePage("bok0502@naver.com",1));
	}
	
	@Test
	public void 희망가순() {
		assertNotNull(dao2.orderByHpricePage("bok0502@naver.com",1));
	}
	
	@Test
	public void 모든상품정보() {
		assertNotNull(dao2.getProductInfo());
	}
	
	@Test
	public void 오늘_최저가() {
		assertNotNull(dao2.getLowPrice("8198816799", "bok0502@naver.com"));
	}
	
	@Test
	public void 그래프_가격가져오기() {
		assertNotNull(dao2.getGraphData("8198816799", "bok0502@naver.com"));
	}
	
	@Test
	public void 추천상품_가져오기() {
		assertNotNull(dao2.getSeizeToday(8));
	}
	
	
	@Test
	public void 페이지수_세기() {
		assertNotNull(dao2.countAllPages("bok0502@naver.com"));
	}
	
	@Test
	public void 모든상품_최저가정보() {
		assertNotNull(dao2.getLowData());
	}
	
	@Test
	public void 알람받을_목록_보내기() {
		assertNotNull(dao2.sendAlarmList("8198816799"));
	}
	
	@Test
	public void 희망상품_일련번호_얻기() {
		assertNotNull(dao2.getHopeDataSeq("8198816799", "bok0502@naver.com"));
	}

	@Test
	public void 알람받은_상품_업데이트() {
	assertTrue(dao2.updateAlarmProduct("8198816799", "bok0502@naver.com"));
	}
}