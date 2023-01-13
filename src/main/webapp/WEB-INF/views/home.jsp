<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Hello world!</h1>

<table>
    <thead>
    <tr>
        <th>영화이름</th>
        <th>감독</th>
        <th>장르</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${movieList}" var="movie">
        <tr>
            <td><c:out value="${movie.movie_name}"/></td>
            <td><c:out value="${movie.director}"/></td>
            <td><c:out value="${movie.types}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>