package br.com.portalRH.PortalRh.model;

import java.time.LocalDate;

public class ExpAnteriores {
    private String descrissaoExp;
    private String cargo;
    private LocalDate periodoInicial;
    private LocalDate periodoFinal;

    //Getters and Setters
    public String getDescrissaoExp() {
        return descrissaoExp;
    }

    public void setDescrissaoExp(String descrissaoExp) {
        this.descrissaoExp = descrissaoExp;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getPeriodoInicial() {
        return periodoInicial;
    }

    public void setPeriodoInicial(LocalDate periodoInicial) {
        this.periodoInicial = periodoInicial;
    }

    public LocalDate getPeriodoFinal() {
        return periodoFinal;
    }

    public void setPeriodoFinal(LocalDate periodoFinal) {
        this.periodoFinal = periodoFinal;
    }

    // Constructor
    public ExpAnteriores() {
    }

    // To String
    @Override
    public String toString() {
        return "ExpAnteriores{" +
                "descrissaoExp='" + descrissaoExp + '\'' +
                ", cargo='" + cargo + '\'' +
                ", periodoInicial=" + periodoInicial +
                ", periodoFinal=" + periodoFinal +
                '}';
    }

}
