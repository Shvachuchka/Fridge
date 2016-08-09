<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form:form action="/registration" method="post" modelAttribute="people">
    <form:errors path="namePeople"/>
    <form:input path="namePeople"/>
    <form:errors path="surname"/>
    <form:input path="surname"/>
     <form:errors path="email"/>
    <form:input path="email"/>
     <form:errors path="phone"/>
    <form:input path="phone"/>

     <form:errors path="password"/>
    <form:input path="password"/>
    <form:errors path="passwordConfirm"/>
     <form:input path="passwordConfirm"/>
    <form:button>Sign up!</form:button>
</form:form>
