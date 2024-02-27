package br.com.collections;

public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.addAula(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.addAula(new Aula("Criando uma Aula", 20));
        javaColecoes.addAula(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(System.out::println);

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.verificarMatricula(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println(a1.equals(turini));
    }
}
