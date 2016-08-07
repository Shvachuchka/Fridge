<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${people}" var="a">
    <a href="/people/page/ ${a.id_People}">
        <div style="width: 300px; height: 300px;font-size: 15px; background-color: darkgrey; color: white; float: left; margin: 10px; border: 3px double black;">
            <p style="text-align: center; padding: 0 10px; font-size: 24pt">${a.namePeople}</p>
            <p style="text-align: center; padding: 0 10px; font-size: 24pt">${a.surname}</p>
            <p style="text-align: center; padding: 0 10px; font-size: 24pt">${a.password}</p>

        </div>
    </a>
</c:forEach>

<p style="clear: left; text-align: center"><sec:authorize access="hasRole('ADMIN')" ><a href="/people/new">Add New People</a></sec:authorize></p>



</body>
</html>
