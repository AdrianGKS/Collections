package br.com.collections;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>(); //conjunto não ordenado
        alunos.add("Laura");
        alunos.add("Igor");
        alunos.add("Flávia");
        alunos.add("Juan");
        alunos.add("Dira");
        alunos.add("Mário");
        //alunos.add("Mário"); não aceita repetições

        boolean presente = alunos.contains("Luiz");
        System.out.println(presente);

        System.out.println("----------------------------");
        System.out.println("Tamanho: " + alunos.size());

        System.out.println("----------------------------");
        System.out.println(alunos);

        System.out.println("----------------------------");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("----------------------------");
        alunos.forEach(System.out::println);
    }
}
