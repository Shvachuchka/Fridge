
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
+<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<div>

    <!--<form method="post" action="/people/create">
        <input type="text" name="namePeople">
        <input type="text" name="surname">
        <input type="password" name="password">

        <button type="submit">Add New People</button>
    </form>  -->

    <form:form action="/people/create" method="post" modelAttribute="people">
        <form:label path="namePeople"> Name:</form:label>
        <form:input path="namePeople"/>
        <form:label path="surname"> Surname:</form:label>
        <form:input path="surname"/>
        <form:label path="password"> Password:</form:label>
        <form:input path="password"/>

        <form:button>Add New People</form:button>



    </form:form>

</div>

</body>
</html>
