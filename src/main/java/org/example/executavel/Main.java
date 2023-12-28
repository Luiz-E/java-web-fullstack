package org.example.executavel;

import org.example.classes.Aluno;
import org.example.classes.Diretor;
import org.example.classes.Pessoa;
import org.example.classes.Secretario;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Alex JDev - Treinamento");
        aluno.setIdade(16);

        Diretor diretor = new Diretor();
        diretor.setNome("Egidio");
        diretor.setRegistroGeral("43243245");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setNome("João");
        secretario.setExperiencia("Administração");
        secretario.setIdade(18);

//        System.out.println(aluno);
//        System.out.println("--------------------------------------------");
//        System.out.println(diretor);
//        System.out.println("--------------------------------------------");
//        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        diretor.pessoaMaiorIdade();
        secretario.pessoaMaiorIdade();

        //Pessoa pessoa = new Pessoa();

        System.out.println("Salário é igual a " + aluno.salario());
        System.out.println("Salário é igual a " + diretor.salario());
        System.out.println("Salário é igual a " + secretario.salario());

        Pessoa pessoa = new Aluno();
        pessoa = secretario;

        teste(aluno);
        teste(diretor);
        teste(secretario);
        teste(pessoa);
    }

    public static void teste(Pessoa pessoa) {
        System.out.println("Essa pessoa é demais = " + pessoa.getNome() + " e o salário é de " + pessoa.salario());
    }
}