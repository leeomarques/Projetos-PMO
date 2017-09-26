package com.example.leonardo.cadastrodepessoas;



public class Pessoa {
    private String nome;
    private String telefone;
    private EstadoAtual estado;

    public Pessoa(String nome, String telefone, EstadoAtual estado) {
        this.nome = nome;
        this.telefone = telefone;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public EstadoAtual getEstado() {
        return estado;
    }

    public void setEstado(EstadoAtual estado) {
        this.estado = estado;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " " +"Telefone: " + telefone;
    }
}
