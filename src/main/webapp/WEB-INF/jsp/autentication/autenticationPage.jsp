<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import ="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    </head>
    <body>
        <center>
            <h1>
                Área de Autenticação do Docente
            </h1>
            <br><br><br>
            ${message}
            <br><br><br>
            <a class="btn btn-primary" role="button" href="<%=request.getContextPath()%>/user/listar">Listar Docentes e Disciplinas Cadastradas</a>
            <a class="btn btn-primary" role="button" href="<%=request.getContextPath()%>/login/logout">Logout</a>
        </center>
    </body>
</html>