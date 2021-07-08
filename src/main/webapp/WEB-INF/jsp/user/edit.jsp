<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import ="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listar Docentes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<center>
    <body>
        <h1>Área de Atualização de Docentes</h1>
        <div class="w-50 p-3" style="background-color: #eee;">
        <form method="post" action="<%=request.getContextPath()%>/user/edit">
            <h3 class="messageError">${message}</h3>
            <input type="text" name="nome" value="${docente.nome}">
            <input type="text" name="email"value="${docente.email}">
            <input type="text" name="password"value="${docente.password}">
            <input type="text" name="name"value="${docente.disciplina}">
            <input type="hidden" name="id" value="${docente.id}" >
            <input class="btn btn-primary" type="submit" value="Editar">
        </form>
            <br><br>
            <a class="btn btn-primary" role="button" href="<%=request.getContextPath()%>/user/listar">Listar Docentes</a>
            <a class="btn btn-primary" role="button" href="<%=request.getContextPath()%>/login/logout">Logout</a>
        </div>
    </body>
</center>
</html>
