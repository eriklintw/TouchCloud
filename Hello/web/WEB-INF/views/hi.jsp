<%-- 
    Document   : index
    Created on : 2016/3/18, 上午 10:33:29
    Author     : ErikLin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hi : ${param.name} (from ${sessionScope.httpMethod})</h1>
        
        如果看到中文亂碼....<br>
        <h3>Get: Servlet container要調整設定</h3><br>
        <h3>POST: Web Project要調整設定</h3>
    </body>
</html>
