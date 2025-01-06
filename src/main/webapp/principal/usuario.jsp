<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <jsp:include page="head.jsp"></jsp:include>
    <body>
      <jsp:include page="theme-loader.jsp"></jsp:include>

      <!-- Pre-loader end -->
      <div id="pcoded" class="pcoded">
          <div class="pcoded-overlay-box"></div>
          <div class="pcoded-container navbar-wrapper">
              <jsp:include page="navbar.jsp"></jsp:include>

              <div class="pcoded-main-container">
                  <div class="pcoded-wrapper">
                      <jsp:include page="navbarmainmenu.jsp"></jsp:include>
                      <div class="pcoded-content">
                          <!-- Page-header start -->
                          <jsp:include page="page-header.jsp"></jsp:include>
                          <!-- Page-header end -->
                            <div class="pcoded-inner-content">
                                <!-- Main-body start -->
                                <div class="main-body">
                                    <div class="page-wrapper">
                                        <!-- Page-body start -->
                                        <div class="page-body">
                                            <div class="row">
                                                <div class="col-sm-12">
                                                    <!-- Basic Form Inputs card start -->
                                                    <div class="card">
                                                        <div class="card-block">
                                                            <h4 class="sub-title">Cad. Usuário</h4>
                                                            <form class="form-material" action="<%= request.getContextPath()%>/ServletUsuarioController" method="post" id="formUser">

                                                            <input type="hidden" name="acao" id="acao" value="">

                                                                <div class="form-group form-default form-static-label">
                                                                    <input type="text" name="id" id="id" class="form-control" readonly="readonly" value="${modelLogin.id}">
                                                                    <span class="form-bar"></span>
                                                                    <label class="float-label">ID:</label>
                                                                </div>
                                                                <div class="form-group form-default form-static-label">
                                                                    <input type="text" name="nome" id="nome" class="form-control" required="required" value="${modelLogin.nome}">
                                                                    <span class="form-bar"></span>
                                                                    <label class="float-label">Nome:</label>
                                                                </div>
                                                                <div class="form-group form-default form-static-label">
                                                                    <input type="email" name="email" id="email" class="form-control" required="required" value="${modelLogin.email}">
                                                                    <span class="form-bar"></span>
                                                                    <label class="float-label">E-mail:</label>
                                                                </div>
                                                                <div class="form-group form-default form-static-label">
                                                                    <input type="text" name="login" id="login" class="form-control" required="required" value="${modelLogin.login}">
                                                                    <span class="form-bar"></span>
                                                                    <label class="float-label">Login:</label>
                                                                </div>
                                                                <div class="form-group form-default form-static-label">
                                                                    <input type="password" name="senha" id="senha" class="form-control" required="required" value="${modelLogin.senha}">
                                                                    <span class="form-bar"></span>
                                                                    <label class="float-label">Senha:</label>
                                                                </div>
                                                                <button type="button" class="btn btn-primary waves-effect waves-light" onclick="limparForm();">Novo</button>
                                                                <button class="btn btn-success waves-effect waves-light">Salvar</button>
                                                                <button type="button" class="btn btn-info waves-effect waves-light" onclick="criarDeleteAjax();">Excluir</button>
                                                                <button class="btn btn-secondary" data-toggle="modal" data-target="#usuario">Pesquisar</button>
                                                            </form>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <span>${msg}</span>
                                        </div>
                                        <!-- Page-body end -->
                                    </div>
                                    <div id="styleSelector"> </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Warning Section Starts -->
        <!-- Older IE warning message -->
        <!--[if lt IE 10]>
        <div class="ie-warning">
            <h1>Warning!!</h1>
            <p>You are using an outdated version of Internet Explorer, please upgrade <br/>to any of the following web browsers to access this website.</p>
            <div class="iew-container">
                <ul class="iew-download">
                    <li>
                        <a href="http://www.google.com/chrome/">
                            <img src="<%=request.getContextPath() %>/assets/images/browser/chrome.png" alt="Chrome">
                            <div>Chrome</div>
                        </a>
                    </li>
                    <li>
                        <a href="https://www.mozilla.org/en-US/firefox/new/">
                            <img src="<%=request.getContextPath() %>/assets/images/browser/firefox.png" alt="Firefox">
                            <div>Firefox</div>
                        </a>
                    </li>
                    <li>
                        <a href="http://www.opera.com">
                            <img src="<%=request.getContextPath() %>/assets/images/browser/opera.png" alt="Opera">
                            <div>Opera</div>
                        </a>
                    </li>
                    <li>
                        <a href="https://www.apple.com/safari/">
                            <img src="<%=request.getContextPath() %>/assets/images/browser/safari.png" alt="Safari">
                            <div>Safari</div>
                        </a>
                    </li>
                    <li>
                        <a href="http://windows.microsoft.com/en-us/internet-explorer/download-ie">
                            <img src="<%=request.getContextPath() %>/assets/images/browser/ie.png" alt="">
                            <div>IE (9 & above)</div>
                        </a>
                    </li>
                </ul>
            </div>
            <p>Sorry for the inconvenience!</p>
        </div>
        <![endif]-->
        <!-- Warning Section Ends -->

        <jsp:include page="jsfile.jsp"></jsp:include>

        <div class="modal fade" id="usuario" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Pesquisa de usuário</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="input-group mb-3">
                            <input type="text" class="form-control" placeholder="Nome" aria-label"nome" id="nomeBusca" aria-describedby="basic-addon2">
                            <div class="input-group-append">
                                <button class="btn btn-outline-success" onclick="buscarUsuario();" type="button">Buscar</button>
                            </div>
                        </div>
                        <table class="table">
                          <thead>
                            <tr>
                              <th scope="col">ID</th>
                              <th scope="col">Nome</th>
                              <th scope="col">Ver</th>
                            </tr>
                          </thead>
                          <tbody></tbody>
                        </table>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript">

            function limparForm() {
                let elementos = document.getElementById("formUser").elements;
                Array.from(elementos).forEach(elemento => {
                    elemento.value = '';
                })
            }

            function criarDelete() {
                if (confirm("Deseja realmente excluir os dados?")) {
                    document.getElementById('formUser').method = 'get';
                    document.getElementById('acao').value = 'deletar'
                    document.getElementById('formUser').submit();
                }
            }

            function criarDeleteAjax() {
                if (confirm('Deseja realmente excluir os dados?')) {
                    let urlAction = document.getElementById('formUser').action;
                    let idUser = document.getElementById('id').value;
                    $.ajax({
                        method: 'get',
                         url: urlAction,
                         data: 'id=' + idUser + '&acao=deletarajax',
                         success: (response) => {
                            limparForm();
                            alert(response);
                         }
                    }).fail((xhr, status, errorThrown) => {
                       alert('Erro ao deletar usuário' + xhr.responseText);
                    });
                }
            }

            function buscarUsuario() {
                let nome = document.getElementById('nomeBusca').value;
                if (nome != null && nome != '' && nome.trim() != '') {
                let urlAction = document.getElementById('id').action
                    $.ajax({
                        method: 'get',
                        url: urlAction,
                        data: 'nome=' + nome + '&acao=buscarUserAjax',
                        success: (response) => {

                        }
                    }).fail(xhr, status, errorThrown) => {
                        alert('Erro ao buscar usuário' + xhr.responseText);
                    });
                }
            }
        </script>

    </body>

</html>
