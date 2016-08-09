<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form:form action="/loginprocessing" method="post">
    <input name="peopleName" type="text" placeholder="Login">
    <input name="password" type="password" placeholder="Password">
    <input type="submit" value="Sign in">
</form:form>
