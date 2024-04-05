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
<form action="${pageContext.request.contextPath}/student" method="POST">
아이디 입력:<input type="text" name="id"><br>
<input type="submit" value="제출">
</form>
<hr>
<form action="${pageContext.request.contextPath}/studentView" method="POST">
      아이디:<input type="text" name="id" ><br>
      패스워드:<input type="text" name="pw" ><br>
      이름:<input type="text" name="name" ><br>
      이메일:<input type="text" name="email" ><br>
      나이:<input type="text" name="age" ><br>      
      <input type="submit" value="전송">
      <input type="reset" value="리셋">
   </form>
   <hr>
   <h1>redirectCheck</h1>   
   <form action="${pageContext.request.contextPath}/redirect/check" method="POST">
아이디 입력:<input type="text" name="id"><br>
<input type="submit" value="제출">
</form>
</body>
</html>