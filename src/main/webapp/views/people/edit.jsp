<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<form:form action="/people/edit" method="post" modelAttribute="people">
        <form:hidden path="id_People" value="${people.id_People}"/>
        <form:input path="namePeople" value="${people.namePeople}"/>
        <form:input path="surname" value="${people.surname}"/>
        <form:input path="password" value="${people.password}"/>
       <form:button>Модифікувати</form:button>
</form:form>
