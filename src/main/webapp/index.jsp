<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Curso JSP</title>
        <style>
            form {
                position: absolute;
                top: 40%;
                left: 33%;
                right: 33%;
            }

            h5 {
                position: absolute;
                top: 30%;
                left: 33%;
            }

            .msg {
                position: absolute;
                top: 70%;
                left: 33%;
                font-size: 15px;
            }
        </style>
    </head>
    <body>
        <h5>Bem vindo ao curso de JSP</h5>
        <form action="ServletLogin" method="post" class="row g-3 needs-validation" novalidate>
        <input type="hidden" value='<%= request.getParameter("url")%>' name="url"/>
            <div class="col-md-6">
                <label for="login" class="form-label">Login: </label>
                <input name="login" id="login" type="text" class="form-control" required>
                <div class="invalid-feedback">Informe o login</div>
            </div>
            <div class="col-md-6">
                <label for="senha" class="form-label">Senha:</label></td>
                <input name="senha" id="senha" type="password" class="form-control" required>
                <div class="invalid-feedback">Informe a senha</div>
            </div>
            <input style="width: 100%;" type="submit" value="Acessar" class="btn btn-primary">
        </form>

        <h5 class="msg">
            ${msg}
        </h5>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script>
            (() => {
              'use strict'

              // Fetch all the forms we want to apply custom Bootstrap validation styles to
              const forms = document.querySelectorAll('.needs-validation')

              // Loop over them and prevent submission
              Array.from(forms).forEach(form => {
                form.addEventListener('submit', event => {
                  if (!form.checkValidity()) {
                    event.preventDefault()
                    event.stopPropagation()
                  }

                  form.classList.add('was-validated')
                }, false)
              })
            })()
        </script>
    </body>
</html>