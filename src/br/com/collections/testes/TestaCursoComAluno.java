package br.com.collections.testes;

import br.com.collections.model.Aluno;
import br.com.collections.model.Aula;
import br.com.collections.model.Curso;

public class TestaCursoComAluno {
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

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(System.out::println);

        System.out.println("----------------------------------");

        //Exemplo de iteração (legado)
//        Set<Aluno> alunos = javaColecoes.getAlunos();
//        Iterator<Aluno> iterator =  alunos.iterator();
//        while(iterator.hasNext()) {
//            Aluno proximo = iterator.next();
//            System.out.println(proximo);
//        }

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.verificarMatricula(a1));

        System.out.println("----------------------------------");

        Aluno carlos = new Aluno("Carlos Rodrigo", 34672);
        System.out.println(a1.equals(carlos));
    }
}
