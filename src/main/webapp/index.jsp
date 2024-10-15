<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <meta charset="UTF-8">
        <title>Curso JSP</title>
    </head>
    <body>
        <h1>Bem vindo ao curso de JSP</h1>
        <form action="ServletLogin" method="post">
        <input type="hidden" value='<%= request.getParameter("url")%>' name="url"/>
            <table>
                <tr>
                    <td><label for="login">Login: </label></td>
                    <td><input name="login" id="login" type="text"></td>
                </tr>
                <tr>
                    <td><label for="senha">Senha:</label></td>
                    <td><input name="senha" id="senha" type="password"></td>
                </tr>
                <tr>
                    <td colspan=2>
                        <input style="width: 100%;" type="submit" value="Enviar">
                    </td>
                </tr>
            </table>
        </form>

        <h4>
            ${msg}
        </h4>

    </body>
</html>