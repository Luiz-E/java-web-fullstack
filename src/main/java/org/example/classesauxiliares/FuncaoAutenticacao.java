package org.example.classesauxiliares;

import org.example.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

    private PermitirAcesso acesso;

    public boolean autenticar() {
        return acesso.autenticar();
    }

    public FuncaoAutenticacao(PermitirAcesso acesso) {
        this.acesso = acesso;
    }

}
