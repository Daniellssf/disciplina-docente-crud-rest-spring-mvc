<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import ="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listagem de Docentes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<center>
<body>
        <h1>
            Lista de Docentes Cadastrados
        </h1>
        <p>${message}</p>
        <br><br><br><br>
        <table  class="table table-hover">
            <tr>
                <th>
                    Editar Docente
                </th>
                <th>
                    Deletar Docente
                </th>
                <th>
                    Id
                </th>
                <th>
                    Nome
                </th>
                <th>
                    E-mail
                </th>
                <th>
                    Senha do Usuário
                </th>
                <th>
                    Disciplina
                </th>
            </tr>
            <c:forEach var="docente" items="${docenteList}">
                <tr>
                    <td>
                        <a href="<%=request.getContextPath()%>/user/edit?id=${docente.id}">Editar</a>
                    </td>
                    <td>
                        <a href="<%=request.getContextPath()%>/user/delete?id=${docente.id}">Deletar</a>
                    </td>
                    <td>
                        <c:out value="${docente.id}" />
                    </td>
                    <td>
                        <c:out value="${docente.nome}" />
                    </td>
                    <td>
                        <c:out value="${docente.email}" />
                    </td>
                    <td>
                        <c:out value="${docente.password}" />
                    </td>
                    <td>
                        <c:out value="${docente.disciplina}" />
                    </td>
                </tr>
            </c:forEach>
        </table>
        <a class="btn btn-primary" role="button" href="<%=request.getContextPath()%>/login/logout">Logout</a>
        <a class="btn btn-primary" role="button" href="<%=request.getContextPath()%>/user/criar">Cadastrar Usuário</a>
</body>
</center>
</html>
