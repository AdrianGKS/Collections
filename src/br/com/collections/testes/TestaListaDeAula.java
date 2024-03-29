package br.com.collections.testes;

import br.com.collections.model.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Resivitando as ArraysLists", 16);
        Aula a2 = new Aula("Lista de Objetos", 19);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 18);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
        System.out.println("----------------------------------");

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println("----------------------------------");

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
        System.out.println("----------------------------------");

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
    }
}
