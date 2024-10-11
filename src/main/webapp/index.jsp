<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <meta charset="UTF-8">
        <title>Curso JSP</title>
    </head>
    <body>
        <h1>Bem vindo ao curso de JSP</h1>
        <form action="receber-nome.jsp">
            <label for="nome">Nome: </label>
            <input name="nome" id="nome" type="text">
            <label for="idade">Idade:</label>
            <input name="idade" id="idade" type="text">
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>