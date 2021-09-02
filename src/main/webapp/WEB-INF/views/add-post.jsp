<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>

    </head>
    <body>
        <h1>Добавление поста</h1>
        <form method="POST" action="/post" id="newPost" name ="newPost" enctype="multipart/form-data">
<%--            <input type="number" id="id" name="id" value="" /><br />--%>
            <input type="text" id="title" name="title" value="" /><br />
            <input type="text" id="text" name="text" value="" /><br />

            <input type="submit" id="btnAddPost" name="btnAddPost" value="Add Post" onclick="" style="cursor:pointer"/>
        </form>
    </body>
</html>