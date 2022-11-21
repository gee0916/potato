<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""  isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 정보 수정</title>
<link rel="shortcut icon"  href="css/images/logo.png"/>
<link rel="stylesheet" type="text/css" href="css/common/reset.css"/>
<link rel="stylesheet" type="text/css" href="css/common/user_wrap_container.css"/>
<link rel="stylesheet" type="text/css" href="css/common/user_navi.css"/><%-- 네비바 필요한 사람만 --%>
<link rel="stylesheet" type="text/css" href="css/mypages/my_info_edit.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$(".edit_btn").click(function() {
		confirm("성공적으로 수정되었습니다.")
	});//click
	
});//ready
</script>

</head>
<body>
<div class="wrap">

<!-- header -->
<%@ include file="../../common/jsp/user_header.jsp" %>
<!-- header end-->

<!-- container -->
<div class="container">
<%-- 마이페이지용 --%>
<div class="wrap-navi">
		<div class="navi">
			<div class="profileWrap">
				<div class="img">
					<img src=""  id="profileImg" name="profileImg" class="img" style="margin: 5px 30px; width: 150px; height: 150px; background: #f8edeb; border-radius: 50%;">
				</div>
				<div class="nickname"><c:out value="${ nick }"/></div>
			</div>			
			<a class="navi-link" href="my_info_edit.do">내 정보 수정</a>
			<a class="navi-link2" href="password_edit.do">비밀번호 수정</a>
			<a class="navi-link2" href="unregister.do">회원탈퇴</a>
			<a class="navi-link" href="my_review.do">내가 쓴 리뷰</a>
			<a class="navi-link" href="like_review.do">좋아요한 리뷰</a>
			<a class="navi-link" href="bookmark.do">휴게소 즐겨찾기</a>
		</div><!-- navi -->
	

<%-- 네비바 끝 --%>

<!-- 내 정보 수정 -->
<div class="info_edit">
	<div class="title">내 정보 수정</div>
	<table>
		<tr>
			<th scope="row">
				<label for="img">프로필 사진</label>
			</th>
			<td>
				<div class="profile_img">
					<img src=""  id="profileImg" name="profileImg" class="profileImg" style="margin: 5px 30px; width: 70px; height: 70px; background: #f8edeb; border-radius: 50%;">
				<div class="upload-button">
					<input type="button" value="사진 등록" class="img_btn">
					<input type="file" name="upfile" id="upfile"/>
					<input type="button" value="삭제" class="img_del_btn">
				</div><!-- upoad-button -->
				</div>
			</td>
		</tr>
		<c:forEach var="mil" items="${ MyInfoList }">
		<tr>
			<th><label>성명</label></th>
			<td><input type="text" value="<c:out value="${ mil.name }"/>" id="name" readonly="readonly"></td>
		</tr>
		<tr>
			<th><label>닉네임</label></th>
			<td><input type="text" value="<c:out value="${ mil.nick }"/>" id="nick"></td>
		</tr>
		<tr>
			<th><label>아이디</label></th>
			<td><input type="text" value="<c:out value="${ mil.id }"/>" id="id" readonly="readonly"></td>
		</tr>
		<tr>
			<th><label>생년월일</label></th>
				<td>
					<input type="date" name="birth" id="birth"  value="<c:out value="${ mil.birth }"/>"  class="birth">
				</td>
		</tr>
		<tr>
			<th><label>휴대폰</label></th>
				<td>
					<input type="text" name="phone_num" value="<c:out value="${ mil.phone }"/>" >
				</td>
		</tr>
		<tr>
			<th><label>이메일</label></th>
			<td><input type="text"  value="<c:out value="${ mil.email }"/>" name="email" id="email" maxlength="100"></td>
		</tr>
		</c:forEach>
	</table>
	
	<button class="edit_btn">확인</button>


</div><!-- info_edit -->
</div><!-- wrap-navi -->

</div><!-- container 건들면 안돼 '0' -->
<!-- container end -->

<!-- footer -->
<%@ include file="../../common/jsp/user_footer.jsp" %>
<!-- footer end -->

</div>
</body>
</html>