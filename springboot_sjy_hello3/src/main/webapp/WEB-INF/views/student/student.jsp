<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>학생 번호를 입력하시오.</h1>
<form action="${pageContext.request.contextPath}/student" method="post">
아이디 입력:<input type="text" name="id"><br>
<input type="submit" value="제출">
</form>
</body>
</html>