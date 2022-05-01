<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/16/2022
  Time: 10:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>StudentList</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container col-md-8 mt-4">
<h2> Welcome to the Students List</h2>
        <div class="row">
            <a href="/show" class="col text text-success">
                Students List
            </a>
            <a href="/add" class="col text text-success text-center">
                Add Student
            </a>
        </div>
<table class="table table-primary text-center mt-3">
<thead>
<tr>
    <th>  ID</th>
    <th>  Name</th>
    <th>  Score</th>
    <th>   MENU</th>
</tr>

</thead>

    <tbody>
    <c:forEach var="student" items="${students}">
    <tr>
    <td><c:out value="${student.id}"></c:out> </td>
        <td><c:out value="${student.name}"></c:out></td>
        <td><c:out value="${student.score}"></c:out></td>
        <td> <a href="/delete?id=<c:out value='${student.id}' />"> <button type="button" class="btn btn-danger">Delete</button> </a>
            <a href="/update?id=<c:out value='${student.id}' />"><button type="button" class="btn btn-warning">Update</button> </a></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>
