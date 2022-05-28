package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class testeintelij {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro = new Livro("teste", "2");
        System.out.println(gato);
        System.out.println(livro);
        /*int s = 5;
        System.out.println("hello world" + s);*/
    }
}

class Livro{
    private String nome;
    private String npgs;

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npgs='" + npgs + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(npgs, livro.npgs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, npgs);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNpgs() {
        return npgs;
    }

    public void setNpgs(String npgs) {
        this.npgs = npgs;
    }

    public Livro(String nome, String npgs) {
        this.nome = nome;
        this.npgs = npgs;
    }
}