<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>HelloWorld Admin page</title>
</head>
<body>
    Dear <strong>${user}</strong>, Welcome to Admin Page.
    <p>
    Server IP : <span id="sip"><%=java.net.InetAddress.getLocalHost()%></span>
    </p>
    <a href="<c:url value="/logout" />">Logout</a>
</body>
</html>