<%--
  Created by IntelliJ IDEA.
  User: Craig
  Date: 2020-09-29
  Time: 4:44 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Note Keeper</title>
</head>
<body>
<form method="POST">
<h1>Simple Note Keeper</h1>
<h2>Edit Note</h2>
<h4 style="display:inline">Title: </h4><br>
<label>
    <input type="text" name="title" value="${note.title}"><br>
</label>
<h4 style="display:inline">Contents:</h4><br>
<label>
    <textarea name="content" >${note.content}</textarea>
</label>
    <input type="submit" value="Save">
</form>
</body>
</html>
