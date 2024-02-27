package br.com.collections.testes;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 =  "Modelando classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>(); //inicializando o objeto
        aulas.add(aula1); //adicionando os itens
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);
        System.out.println("----------------------------------");

        aulas.remove(0); //removendo pelo índice

        System.out.println(aulas);
        System.out.println("----------------------------------");

        for (String aula : aulas) { //itentando o objeto
            System.out.println("Aula: " + aula);
        }
        System.out.println("----------------------------------");

        String primeiraAula = aulas.get(0); //pegando um item com base no índice
        System.out.println("A primeira aula é: " + primeiraAula);
        System.out.println("----------------------------------");

        for (int i = 0; i < aulas.size(); i++) { //iterando o objeto com base no tamanho
            System.out.println("Aula: " + aulas.get(i));
        }
        System.out.println("----------------------------------");

        System.out.println(aulas.size()); //vendo o tamanho do objeto
        System.out.println("----------------------------------");

        aulas.forEach(aula -> {
            System.out.println("Percorrendo: \n" + aula);
        }); //percorrendo o objeto pelo método foreach
        System.out.println("----------------------------------");

        aulas.add("Aumentando o conhecimento");
        System.out.println(aulas);
        System.out.println("----------------------------------");

        Collections.sort(aulas); //usando classe Collections para ordenar o objeto
        System.out.println("Depois de ordenando \n" + aulas);


    }
}