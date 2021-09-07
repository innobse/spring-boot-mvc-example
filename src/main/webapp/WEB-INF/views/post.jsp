<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>

    </head>
    <body>
        <h1>${post.title}</h1>
        <br />
        <p>${post.text}</p>
        <hr />
        <ul type="disc">
            <c:forEach var="comment" items="${post.comments}">
                <li>${comment.text}</li>
            </c:forEach>
        </ul>

        <a href="/post" ><<< Назад</a>
        <br />
        <a href="/logout" >ВЫХОД</a>
    </body>
</html>