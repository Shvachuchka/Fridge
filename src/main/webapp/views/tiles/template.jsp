<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SASHA!!!</title>
</head>
<body>
    <header><tiles:insertAttribute name="header"/></header>
    <div><tiles:insertAttribute name="menu"/></div>
    <div><tiles:insertAttribute name="body"/></div>
    <footer><tiles:insertAttribute name="footer"/></footer>
</body>
</html>
