<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container-fluid" align="center">
		<h1>Register Here</h1>
		<form action="Register " method="post">
			Name<br> <input type="text" name="name"><br> <br>
			Address<br> <input type="text" name="address"><br>
			<br> Email<br> <input type="text" name="email"><br>
			<br> <button type="submit" value="Submit" >Submit</button>
		</form>
		<br><br>
		<a href="Registerdelete.jsp"><button >Click Here to Delete User</button></a>
		<a href="Registerupdate.jsp"><button >Click Here to Update User</button></a>
	</div>


</body>
</html>