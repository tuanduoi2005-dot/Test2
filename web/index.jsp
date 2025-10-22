<%-- 
    Document   : index
    Created on : Oct 13, 2025, 5:06:09 PM
    Author     : minhtuan
--%>
<%@page import= "model.Student" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>StudentID</th>
                    <th>FullName</th>
                    <th>Gender</th>
                    <th>DOB</th>
                    <th>Email</th>
                    <th>Phone</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="i" items="${requestScope.listStd}">
                <tr>
                    <td>${i.studentId}</td>
                    <td>${i.fullName}</td>
                    <td>${i.gender}</td>
                    <td>${i.dob}</td>
                    <td>${i.email}</td>
                    <td>${i.phone}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
