package org.example;

import java.math.BigDecimal;

public class ExecutarTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setId(1L);
        produto1.setNome("Módulo Orientação Objetos");
        produto1.setValor(BigDecimal.valueOf(100));

        Produto produto2 = new Produto();
        produto2.setNome("Módulo de Spring Boot API REST");
        produto2.setId(2L);
        produto2.setValor(BigDecimal.valueOf(300));

        Produto produto3 = new Produto();
        produto3.setNome("Módulo de Angular 8");
        produto3.setId(3L);
        produto3.setValor(BigDecimal.valueOf(100));

        Produto produto4 = new Produto();
        produto4.setNome("Módulo de Hibernate");
        produto4.setId(4L);
        produto4.setValor(BigDecimal.valueOf(300));

        Venda venda = new Venda();

        venda.setDescricao("Venda Curso Formação Java");
        venda.setEnderecoEntrega("Entrega por email");
        venda.setId(10L);
        venda.setNomeCliente("Luiz");
        //venda.setValorTotal(BigDecimal.valueOf(197.00));

        venda.getListaProdutos().add(produto1);
        venda.getListaProdutos().add(produto2);
        venda.getListaProdutos().add(produto3);
        venda.getListaProdutos().add(produto4);

//        for (Produto produto : venda.getListaProdutos()) {
//            System.out.println("Produto: " + produto);
//        }

        System.out.println("Descrição da venda: " + venda.getDescricao() + " e o total da venda é " + venda.getValorTotal());
    }
}
