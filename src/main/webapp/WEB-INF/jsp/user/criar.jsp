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
                Area de Cadastro do Docente
            </h1>
            <br><br>
            ${message}
            <br><br> <br><br>
            <div class="w-50 p-3" style="background-color: #eee;">
                <form method="post" action="<%=request.getContextPath()%>/user/criar">
                    <div class="input-group">
                        <span class="input-group-text">Nome Completo</span>
                        <input type="text" name="nome" aria-label="First name" class="form-control">
                    </div>
                    <div class="input-group">
                        <span class="input-group-text">Email do docente</span>
                        <input type="email" name="email" aria-label="First name" class="form-control">
                    </div>
                    <div class="input-group">
                        <span class="input-group-text">Password do docente</span>
                        <input type="password" name="password" aria-label="First name" class="form-control">
                    </div>
                    <div class="input-group">
                        <span class="input-group-text">Disciplina do docente</span>
                        <input type="text" name="disciplina" aria-label="First name" class="form-control">
                    </div>
                    <br><br>
                    <input class="btn btn-primary" type="submit" value="Salvar">
                    <a class="btn btn-primary" role="button" href="<%=request.getContextPath()%>/login/loginPage">Login</a>
                </form>
                </div>
            <br><br>
        </center>
    </body>
</html>