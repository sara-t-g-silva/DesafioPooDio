package br.com.dio.desafio.dominio;

import javax.swing.text.html.Option;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudoInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);

    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());
        }else{
            System.err.println("VocÊ não está matriculado!");
        }
    }

    public double calcularXP(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudoInscrito->conteudoInscrito.calcularXp()).sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudosConcluidos);
    }
}
