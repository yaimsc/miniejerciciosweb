<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>02-arraysTabla</title>
<style type = text/css>
.suspenso{
color  : red; 
}

.aprobado{
color : green;
}
</style>
</head>

<body>
<%
String[] nombres = {"Jon", "Maria", "Eneko", "Miguel", "Josu"}; 

int[] notas = {10, 2, 7, 9, 0}; 
%>

<table border=1px>
<tr>
<th>Nombre</th>
<th>Notas</th>


<% 
//el for recorre los arrays creados por programacion
for(int i = 0; i < nombres.length; i++){
	out.print("<tr><td>" + nombres[i] + "</td>"); 
	if(notas[i] < 5){
		out.print("<td class= suspenso>" + notas[i]); 
	}else{
		out.print("<td class = aprobado>" + notas[i]); 
	}
}
%>
</tr>
</table>
</body>
</html>