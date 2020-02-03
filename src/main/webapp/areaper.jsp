<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.mycompany.actividad3.Calculos"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cálculos</h1>
        <%
            String n1=request.getParameter("num1");
            String n2=request.getParameter("num2");
            
            Calculos a=new Calculos();
            a.Calculos(n1,n2);
            a.calcularArea();
            int resultado=a.getResultado();
       
            a.calcularPerimetro();
            int resultado2=a.getResultado();
           
        %>
    <h2>Area :<%=resultado%></h2>
    <h2>Perimetro :<%=resultado2%></h2>    
    </body>
</html>
