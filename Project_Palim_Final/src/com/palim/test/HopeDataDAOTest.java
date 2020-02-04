package com.palim.test;
import java.util.HashMap;
import java.util.Map;

import com.palim.dao.HopeDataDAO;

public class HopeDataDAOTest {
public static void main(String[] args) {
	HopeDataDAO dao = new HopeDataDAO();
	Map<String, String> inputData = new HashMap();
	inputData.put("productID", "121212");
	inputData.put("productImg", "1212121");
	inputData.put("productLink", "121212");
	inputData.put("productTitle", "1212112");
	inputData.put("hopePrice", "1212112");
	inputData.put("userID", "bok0502@naver.com");
	
	Map<String, String> inputData2 = new HashMap();
	inputData2.put("lPrice", "52500");
	inputData2.put("hopeDataSeq", "31");
	inputData2.put("productType", "1");
	
	Map<String, String> inputData3 = new HashMap();
	inputData3.put("hopePrice", "53500");
	inputData3.put("productID", "80254400089");
	inputData3.put("userID", "bok0502@naver.com");
	
	Map<String, String> inputData50 = new HashMap();
	inputData50.put("productID", "80254400089");
	inputData50.put("userID", "bok0502@naver.com");
	
	
	
	//System.out.println(dao.addHopeList(inputData));
	//System.out.println(dao.addLowPricePerDay(inputData2));
	//System.out.println(dao.checkDuplicateHopeProduct("bok0502@naver.com"));
	//System.out.println(dao.getAllHopeListToday());
	//System.out.println(dao.getAllHopeListYesterday());
	//System.out.println(dao.updateHopePrice(inputData3));
	//System.out.println(dao.deleteHopeProduct(inputData50));
	//System.out.println(dao.getLowPriceToday(inputData50));
	//System.out.println(dao.getLowPriceFirstDay(inputData50));
	//System.out.println(dao.orderByRegistrationAsc("bok0502@naver.com"));
	//System.out.println(dao.orderByRegistrationDesc("bok0502@naver.com"));
	//System.out.println(dao.orderByHopePrice("bok05022@naver.com"));
	//System.out.println(dao.orderByLowPrice("bok05022@naver.com"));
	//System.out.println(dao.getProductInfo());
	//System.out.println(dao.getLowPrice(inputData50));
	System.out.println("end");
	
}
}
