<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>

    </head>
    <body>
        <h1>Вот все посты на сегодня!</h1>
        <p><a href="/post?view=list">Отобразить списком</a></p>
        <br />
        <table border="1px">
            <c:forEach var="post" items="${postList}">
                <tr>
                    <td width="30%" valign="top">
                        <a href="post/${post.id}" >${post.title}</a>
                    </td>
                    <td width="70%">
                        <ul type="disc">
                            <c:forEach var="comment" items="${post.comments}">
                                <li>${comment.text}</li>
                            </c:forEach>
                        </ul>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>