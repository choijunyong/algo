<%@page import="java.util.List"%>
<%@page import="com.palim.dao.HopeDataDAO"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<style>
#font {
   font-size:13pt;
}
.product{
	width : 25%;
	height : 30%;
	float: left;
	padding-left : 5;
}
img {
	width : 60%;
	height: 50%;
}
.title {
	height:8%;
	text-overflow:ellipsis;
	white-space:nowrap;
	word-wrap:normal;
	overflow:hidden; 
}
@media screen and (max-width:400px) {
#font {
   font-size:8pt;
}
.product{
   width:50%;
}
.title {
	height : 10%;
	text-overflow:ellipsis;
	white-space:nowrap;
	word-wrap:normal;
	overflow:hidden;
}

}
</style>
<html>
<title>오늘을 잡아라!</title>
<body>
<!--Content size -->
<div id="main" class="w3-main w3-content" style="max-width: 1000px;">
<%@include file="header.jsp"%>
<%@include file="header_Search.jsp"%>
      <!-- 이미지출력부분 -->
      <div class="w3-row-padding w3-center">
      <%Collection<Map<String, String>> result = (Collection)request.getAttribute("result");
      if(result!=null){
	   		for(Map<String, String> product : result) { %>
	        <div class="product">
	            <a href="<%=product.get("productLink")%>"><img src=<%=product.get("productImg")%>></a>          
	            <p class="title"><%=product.get("productTitle")%></p>
	            <p><%=product.get("lPrice")%>원</p>
	            <p style="color:red"><%= String.format("%.2f",Double.parseDouble(product.get("percentage"))) %>%</p>
	        </div>
	         <%}
	   	}%>
      </div>
</div>
<br>
</body>
</html>	
<%@include file="footer.jsp"%>