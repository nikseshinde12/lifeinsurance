<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<form action="insert_HR" method="post">
<div class="container-fluid" align="center" >
Employ name: <input type ="text" name="empname"><br><br>
Total exp: <input type="text" name="totalExperience" inputmode="decimal" pattern="[0-9]*[.,]?[0-9]*"><br><br>
skills: <input type="text" name="skills"><br><br>
Package:<input type="text" name="pac_kage" inputmode="decimal" pattern="[0-9]*[.,]?[0-9]*"><br><br>

<button type="submit">submit</button>
</div>
</form>
</div>

</body>
</html>