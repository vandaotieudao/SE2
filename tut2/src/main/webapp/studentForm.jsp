<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/19/2022
  Time: 12:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student </title>
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
<div align="center">
    <c:if test="${student != null}">
    <form action="update" method="post">
        </c:if>
        <c:if test="${student == null}">
        <form action="add" method="post">
            </c:if>
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        <c:if test="${student != null}">
                            Edit Student
                        </c:if>
                        <c:if test="${student == null}">
                            Add New Student
                        </c:if>
                    </h2>
                </caption>
                <c:if test="${student != null}">
                    <input type="hidden" name="id" value="<c:out value='${student.id}' />" />
                </c:if>
                <tr>
                    <th>Name: </th>
                    <td>
                        <input type="text" name="name" size="45"
                               value="<c:out value='${student.name}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Score: </th>
                    <td>
                        <input type="text" name="score" size="45"
                               value="<c:out value='${student.score}' />"
                        />
                    </td>
                </tr>

                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save" />
                    </td>
                </tr>
            </table>
        </form>
</div>
</body>
</html>