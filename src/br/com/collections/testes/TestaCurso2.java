package br.com.collections.testes;

import br.com.collections.model.Aula;
import br.com.collections.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaCollections =  new Curso("Dominando Coleções no Java", "João Castro");

        //javaCollections.getAulas().add(new Aula("Trabalahndo com Arraylist", 21));
        javaCollections.addAula(new Aula("Trabalahndo com Arraylist", 21));
        javaCollections.addAula(new Aula("Criando uma Aula", 20));
        javaCollections.addAula(new Aula("Modelando Coleções", 23));

        List<Aula> aulasImutaveis = javaCollections.getAulas();

        System.out.println(aulasImutaveis);
        System.out.println("----------------------------------");

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println("----------------------------------");

        System.out.println(javaCollections.getTempoTotal());
        System.out.println("----------------------------------");

        System.out.println(javaCollections);
    }
}
