<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ComputeForm</title>
</head>
<body>
	<h1>* 계산기 *</h1>
	<!-- 1) JSP메소드
	<form action="computeok1.jsp" method="get">
	 -->
	 <!-- 2) new 연산자 
	 <form action="computeok2.jsp">
	 -->
	 <!-- 3) Java Bean -->
	 <form action="computeok3.jsp">
		<table border="1">
		  <tr>
		    <th>숫자1</th>
		    <td><input type="number" name="num1" size="5"></td>
		  </tr>
		  <tr>
		    <th>숫자2</th>
		    <td><input type="number" name="num2" size="5"></td>
		  </tr>
		  <tr>
		    <td colspan="2">
		       <input type="submit" value="계산">
		    </td>
		  </tr>  

  		</table>
	</form>
</body>
</html>