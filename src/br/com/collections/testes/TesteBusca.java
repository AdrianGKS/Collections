package br.com.collections.testes;

import br.com.collections.model.Aluno;
import br.com.collections.model.Aula;
import br.com.collections.model.Curso;

public class TesteBusca {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.addAula(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.addAula(new Aula("Criando uma Aula", 20));
        javaColecoes.addAula(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Carlos Rodrigo", 34672);
        Aluno a2 = new Aluno("Antônio Belarmino", 23454);
        Aluno a3 = new Aluno("Júlia Casagrande", 17645);
        Aluno a4 = new Aluno("Viviane Arruda", 234234);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);
        javaColecoes.matricular(a4);

        Aluno aluno = javaColecoes.buscarMatricula(17645);
        System.out.println("Aluno: " + aluno);

        Aluno aluno2 = javaColecoes.buscarMatricula(1221);
        System.out.println("Aluno: " + aluno2);
    }
}
