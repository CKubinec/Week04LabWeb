<%--
  Created by IntelliJ IDEA.
  User: Craig
  Date: 2020-09-29
  Time: 4:44 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Note Keeper</title>
</head>
<body>

<h1>Simple Note Keeper</h1>
<h2>View Note</h2>
<h4 style="display:inline">Title: </h4>${note.title}<br>
<h4>Contents:</h4>
<p>${note.content}</p>
<a href="note?edit">Edit</a>
</body>
</html>
