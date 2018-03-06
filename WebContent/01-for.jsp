<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>01-For</title>
</head>
<body>
<%
String[] nombres = {"Jon", "Maria", "Eneko", "Miguel", "Josu"}; 

int[] edades = {22, 23, 24, 19, 20}; 

//el for recorre los arrays creados por programacion
for(int i = 0; i < nombres.length; i++){
	out.print(nombres[i] + " " + edades[i] + "<br>"); 
}
%>
</body>
</html>