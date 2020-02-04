<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<html>
<head>
<title>비밀번호재설정</title>
<body>
	<!-- Content 크기 -->
	<div id="main" class="w3-content" style="max-width: 1000px; margin: auto;">
	<%@include file="header_Logo.jsp"%>
	<header class="w3-container w3-center" style="padding-top: 80px;">
		<h1 class="w3-xxlarge">비밀번호재설정</h1>
	</header>
		<div class="w3-center">
			<p>본인 확인을 위해 휴대폰 인증을 해주세요</p>
			<br>
		</div>
	<!-- 안쪽 틀 -->
		<div class="w3-content" style="max-width: 550px; margin: auto;">
			<!-- 아이디(이메일) -->
			<div class="w3-row w3-section">
				<div class="w3-col" style="width: 15%; text-align: center">
					<i class="w3-xlarge fa fa-envelope"></i>
				</div>
				<div class="w3-rest" style="width: 85%">
					<font size="5"> <%=session.getAttribute("findUserID")%> </font>
				</div>
			</div>
			<!-- 핸드폰번호 -->
			<div class="w3-row w3-section">
				<div class="w3-col" style="width: 15%; text-align: center">
					<i class="fa fa-mobile" style="font-size: 35pt"></i>
				</div>
				<div class="w3-rest" style="width: 85%">
					<div class="w3-bar">
						<select id="phonefirst" name="phonefirst" class="w3-select w3-border w3-bar-item" style="width: 25%; height: 41px; margin-right:1%; padding-left: 3; text-align: center">
							<option value="010">010</option>
							<option value="011">011</option>
							<option value="016">016</option>
							<option value="017">017</option>
							<option value="018">018</option>
							<option value="019">019</option>
						</select> 
						<input type="text" id="phonerest" name="phonerest" class="w3-input w3-border w3-bar-item" style="width: 45%; height: 41px; margin-right:4%" maxlength="8">
						<div id="checkCertificate"><button type="button" id="certificate" class="w3-button w3-light-grey w3-border w3-bar-item w3-center" style="width: 20%; height: 41px; padding-left:5; padding-right: 5">인증</button></div>
					</div>
					<!-- 인증번호 입력창 -->
					<input id="inputCertificate" type="text" class="w3-input w3-border" style="width:71%; margin-top:1" maxlength="6" placeholder="인증번호 6자리 숫자 입력">
					<div id="phonecheck" style="padding-top:5px; color: red"></div>
					<!-- 인증번호 문구 div -->
					<div id="inform" style="width:95%; margin-top:2; padding-left:3; font-size: 10pt"></div>
				</div>
			</div>
			<!-- 확인/취소 -->
			<div class="w3-center" style="margin-top: 10%">
				<div class="w3-bar">
					<input type="button" id="submit" class="w3-btn w3-light-grey w3-border w3-bar-item" value="확인">
					<input type="button" id="cancel" class="w3-btn w3-light-grey w3-border w3-bar-item" style="margin-left: 50px" value="취소">
				</div>
			</div>
		</div>
	</div>
<%@include file="footer.jsp"%>	
</body>
</html>

<script type="text/javascript">

	//취소버튼 클릭 시 홈으로 이동	
	$( "#cancel" ).on("click", function(){
			location.href="controller?cmd=loginUI"
	});
	
	//인증번호 전송
	$( "#certificate" ).on("click", function() {
		$.ajax({
			url : "controller?cmd=sendCertificateNumberAction",
			data : {
				phonefirst : $( "#phonefirst" ).val(),
				phonerest : $("#phonerest").val()
			},
			success : function(result){				
					if(result=="") {
						$( "#inform" ).html("<font color=red>인증번호전송에 실패하였습니다.</font>");
					} else {					
						$( "#inform" ).html("<font color=blue>인증번호를 발송했습니다.(유효시간 3분)<br>인증번호가 오지 않으면 <br>입력하신 정보가 정확한지 확인하여 주세요.</font>");
						$( "#checkCertificate" ).html('<button type="button" id="certificate" class="w3-button w3-light-grey w3-border w3-bar-item w3-center" style="width: 20%; height: 41px; padding-left:5; padding-right: 5">확인</button>');
						$( "#checkCertificate" ).on("click", function() {
							alert(result);
							if(JSON.parse(result)==($( "#inputCertificate" ).val())){
								$( "#inform" ).html("<font color=blue>인증되었습니다.</font>")
							} else {
								$( "#inform" ).html("");
							}
						})
					}
			}
		})
	});;
	
	//데이터(핸드폰 번호) 전송 
	$( "#submit" ).on("click", function() {
		if($( "#inform" ).html()=="") {
			alert("번호 인증을 해주세요.");
			location.href = "";
		} else {		
			location.href = "controller?cmd=findPWSetPWUI";
		}
	})
	
</script>