package br.com.portalRH.PortalRh.model;

public class Filiacao {

    private String nomePai;
    private String nomeMae;
    private String telPai;
    private String telMae;

    // Getters and Setters
    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getTelPai() {
        return telPai;
    }

    public void setTelPai(String telPai) {
        this.telPai = telPai;
    }

    public String getTelMae() {
        return telMae;
    }

    public void setTelMae(String telMae) {
        this.telMae = telMae;
    }

    // Constructor
    public Filiacao() {
    }

    // To String
    @Override
    public String toString() {
        return "Filiacao{" +
                "nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", telPai='" + telPai + '\'' +
                ", telMae='" + telMae + '\'' +
                '}';
    }

}
