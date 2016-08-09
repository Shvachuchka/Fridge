<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<form:form action="/people/edit" method="post" modelAttribute="people">

    <form:hidden path="id_People"/>
    <form:input path="namePeople"/>
    <form:input path="surname"/>
    <form:button>Модифікувати</form:button>

</form:form>
