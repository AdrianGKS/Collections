package br.com.collections;


import java.util.ArrayList;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaCollections = new Curso("Dominando Coleções no Java", "João Castro");

        //javaCollections.getAulas().add(new Aula("Trabalahndo com Arraylist", 21));
        javaCollections.addAula(new Aula("Trabalahndo com Arraylist", 21));
        javaCollections.addAula(new Aula("Criando uma Aula", 20));
        javaCollections.addAula(new Aula("Modelando Coleções", 23));

        System.out.println(javaCollections.getAulas());
    }
}
