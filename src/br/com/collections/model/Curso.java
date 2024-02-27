package br.com.collections.model;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaDeAluno = new HashMap<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void addAula(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        return this.aulas.stream()
                .mapToInt(Aula::getTempo)
                .sum();
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaDeAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean verificarMatricula(Aluno alunos) {
        return this.alunos.contains(alunos);
    }

    @Override
    public String toString() {
        return "[Curso: " +
                nome +
                ", tempo total: " +
                this.getTempoTotal() +
                ", aulas: " +
                this.aulas +
                "]";
    }

    public Aluno buscarMatricula(int numero) {
        if (!matriculaDeAluno.containsKey(numero))
            throw new NoSuchElementException("Não há aluno com tal matrícula");

        return matriculaDeAluno.get(numero);
    }
}
