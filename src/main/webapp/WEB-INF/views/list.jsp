<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>

    </head>
    <body>
        <h1>Вот все посты на сегодня!</h1>
        <p><a href="/post?view=table">Отобразить таблицей</a></p>
        <br />
        <ul type="square">
            <c:forEach var="post" items="${postList}">
                <li><a href="post/${post.id}" >${post.title}</a></li>
                <ul type="disc">
                    <c:forEach var="comment" items="${post.comments}">
                        <li>${comment.text}</li>
                    </c:forEach>
                </ul>
            </c:forEach>
        </ul>
        <a href="/post/new">Добавить пост</a>
    </body>
</html>