package br.com.collections.testes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {
    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        nomesParaIdade.keySet().forEach(n -> System.out.println(nomesParaIdade.get(n)));
        System.out.println("----------------------------------");

        Set<String> chaves = nomesParaIdade.keySet();
        chaves.forEach(System.out::println);
        System.out.println("----------------------------------");

        Collection<Integer> valores =  nomesParaIdade.values();
        valores.forEach(System.out::println);
        System.out.println("----------------------------------");

        Set<Map.Entry<String, Integer>> associacoes =  nomesParaIdade.entrySet();
        associacoes.forEach(System.out::println);
    }
}
