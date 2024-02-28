package br.com.portalRH.PortalRh.model;

import java.time.LocalDate;

public class Dependentes {
    private String nomeDependente;
    private LocalDate dataNascimento;
    private Escolaridade escolaridade;

    //Getters and Setters
    public String getNomeDependente() {
        return nomeDependente;
    }

    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }


    //Constructor
    public Dependentes() {
    }

    // To String
    @Override
    public String toString() {
        return "Dependentes{" +
                "nomeDependente='" + nomeDependente + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", escolaridade=" + escolaridade +
                '}';
    }
}
