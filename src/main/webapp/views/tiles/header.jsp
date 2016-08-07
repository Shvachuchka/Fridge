<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="height: 40px; background-color: darkslategrey; padding: 20px "; >
    <p style="clear: left; text-align: right"><sec:authorize access="isAnonymous()"><a href="/login" style="color: white; ">Login</a></sec:authorize></p>
    <sec:authorize access="isAuthenticated()">
        <form:form method="post" action="/logout">
            <button type="submit">Logout</button>
        </form:form>
    </sec:authorize>
</div>
</body>
</html>
