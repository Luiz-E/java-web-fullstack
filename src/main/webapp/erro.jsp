<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <meta charset="UTF-8">
        <title>Erros</title>
    </head>
    <body>
        <h1>Mensagem de erro, entre em contato com a equipe de suporte do sistema.</h1>
        <%
            out.print(request.getAttribute("msg"));
         %>
    </body>
</html>