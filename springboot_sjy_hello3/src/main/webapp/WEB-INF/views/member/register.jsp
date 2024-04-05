<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<form action="/member/register" method="post">
이름:<input type="text"  name="name" value="${member.name }" ><br>
아이디:<input type="text"  name="id"  value="${member.id }"  ><br>
비번:<input type="text"  name="pw"  value="${member.pw }" ><br>
이메일:<input type="text"  name="email"  value="${member.email }" ><br>
나이:<input type="text"  name="age"  value="${member.age}" ><br>
<input type="submit"  value="전송">
<input type="reset"  value="리셋">
<hr>
${member.name }<br>
${member.id }<br>
${member.pw }<br>
${member.email }<br>
${member.age }<br>

</form>
</body>
</html>