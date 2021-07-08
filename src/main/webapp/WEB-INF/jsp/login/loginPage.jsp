<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import ="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

        <head>
            <title>Pagina de Login</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        </head>
        <center>
        <body>
            <h1>Login do Usuário:</h1>
            <br><br>
            ${message}
            <br><br><br><br><br><br>
            <div class="position-relative">
                <div class="position-absolute top-50 start-50 translate-middle">
                    <form class="row g-3" method="post" action="<%=request.getContextPath()%>/login/loginPage">
                        <div class="col-auto">
                            <label for="staticEmail2" class="visually-hidden">Email</label>
                            <input type="email" name="email" class="form-control" id="staticEmail2" placeholder="email@example.com">
                        </div>
                        <div class="col-auto">
                            <label for="inputPassword2" class="visually-hidden">Password</label>
                            <input type="password" name="password" class="form-control" id="inputPassword2" placeholder="Password">
                        </div>
                        <div class="col-auto">
                            <button type="submit" class="btn btn-primary mb-3">Login</button>
                        </div>
                    </form>
                </div>
            </div>
            <br><br><br>
            <a class="btn btn-primary" role="button" href="<%=request.getContextPath()%>/user/criar">Cadastrar Usuário</a>
        </body>
    </center>
</html>
