<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<form action="/member/register" method="post">
이름:<input type="text"  name="name" ><br>
아이디:<input type="text"  name="id"  ><br>
비번:<input type="text"  name="pw" ><br>
이메일:<input type="text"  name="email" ><br>
나이:<input type="text"  name="age" ><br>
<input type="submit"  value="전송">
<input type="reset"  value="리셋">
<h1>${memberVO.name }</h1>
<h1>${memberVO.id }</h1>
<h1>${memberVO.pw }</h1>
<h1>${memberVO.email }</h1>
<h1>${memberVO.age }</h1>
</form>
</body>
</html>