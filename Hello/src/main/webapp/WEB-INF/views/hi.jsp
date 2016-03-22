<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hi</title>
    </head>
    <body>
        <h1>Hi : ${param.name} (from ${sessionScope.httpMethod})</h1>
        
        <h2>get 出現亂碼，Container需要設定</h2>
        <h2>post 出現亂碼，web.xml需要設定</h2>
    </body>
</html>