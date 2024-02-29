package br.com.portalRH.PortalRh.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String ctbs;
    private Double salario;
    private String tituliEleitor;
    private LocalDate dataNascimento;
    private String carteiraReservista;
    private String pisPasep;
    private String registroProfissional;
    private String sindicato;
    private String setor;
    private String cnh;
    private LocalDate dataAdimissao;
    private Cargo cargo;
    private String racaCor;
    private String religiao;
    private Boolean doadorSangue;
    private List<Certificacoes> certificacoes;
    private String nacionalidade;
    private String redeSocial;
    private String areaAtuacao;
    private String matricula;
    private List <ExpAnteriores> expAnteriores;
    private String idiomas;
    private Integer horaExtra;
    private LocalTime entrada;
    private LocalTime saida;
    private Escolaridade escolaridade;
    private EstadoCivil estadoCivil;
    private Genero genero;
    private ModalidadeContratual modalidadeContratual;
    private Status status;
    private TipoConta tipoConta;
    private TipoRH tipoRH;
    private Turno turno;

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCtbs() {
        return ctbs;
    }

    public void setCtbs(String ctbs) {
        this.ctbs = ctbs;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTituliEleitor() {
        return tituliEleitor;
    }

    public void setTituliEleitor(String tituliEleitor) {
        this.tituliEleitor = tituliEleitor;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCarteiraReservista() {
        return carteiraReservista;
    }

    public void setCarteiraReservista(String carteiraReservista) {
        this.carteiraReservista = carteiraReservista;
    }

    public String getPisPasep() {
        return pisPasep;
    }

    public void setPisPasep(String pisPasep) {
        this.pisPasep = pisPasep;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public String getSindicato() {
        return sindicato;
    }

    public void setSindicato(String sindicato) {
        this.sindicato = sindicato;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public LocalDate getDataAdimissao() {
        return dataAdimissao;
    }

    public void setDataAdimissao(LocalDate dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getRacaCor() {
        return racaCor;
    }

    public void setRacaCor(String racaCor) {
        this.racaCor = racaCor;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    public Boolean getDoadorSangue() {
        return doadorSangue;
    }

    public void setDoadorSangue(Boolean doadorSangue) {
        this.doadorSangue = doadorSangue;
    }

    public List<Certificacoes> getCertificacoes() {
        return certificacoes;
    }

    public void setCertificacoes(List<Certificacoes> certificacoes) {
        this.certificacoes = certificacoes;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<ExpAnteriores> getExpAnteriores() {
        return expAnteriores;
    }

    public void setExpAnteriores(List<ExpAnteriores> expAnteriores) {
        this.expAnteriores = expAnteriores;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public Integer getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(Integer horaExtra) {
        this.horaExtra = horaExtra;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getSaida() {
        return saida;
    }

    public void setSaida(LocalTime saida) {
        this.saida = saida;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ModalidadeContratual getModalidadeContratual() {
        return modalidadeContratual;
    }

    public void setModalidadeContratual(ModalidadeContratual modalidadeContratual) {
        this.modalidadeContratual = modalidadeContratual;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public TipoRH getTipoRH() {
        return tipoRH;
    }

    public void setTipoRH(TipoRH tipoRH) {
        this.tipoRH = tipoRH;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    // Constructor
    public Funcionario() {
    }

    // To String
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", endereco='" + endereco + '\'' +
                ", ctbs='" + ctbs + '\'' +
                ", salario=" + salario +
                ", tituliEleitor='" + tituliEleitor + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", carteiraReservista='" + carteiraReservista + '\'' +
                ", pisPasep='" + pisPasep + '\'' +
                ", registroProfissional='" + registroProfissional + '\'' +
                ", sindicato='" + sindicato + '\'' +
                ", setor='" + setor + '\'' +
                ", cnh='" + cnh + '\'' +
                ", dataAdimissao=" + dataAdimissao +
                ", cargo=" + cargo +
                ", racaCor='" + racaCor + '\'' +
                ", religiao='" + religiao + '\'' +
                ", doadorSangue=" + doadorSangue +
                ", certificacoes=" + certificacoes +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", redeSocial='" + redeSocial + '\'' +
                ", areaAtuacao='" + areaAtuacao + '\'' +
                ", matricula='" + matricula + '\'' +
                ", expAnteriores=" + expAnteriores +
                ", idiomas='" + idiomas + '\'' +
                ", horaExtra=" + horaExtra +
                ", entrada=" + entrada +
                ", saida=" + saida +
                ", escolaridade=" + escolaridade +
                ", estadoCivil=" + estadoCivil +
                ", genero=" + genero +
                ", modalidadeContratual=" + modalidadeContratual +
                ", status=" + status +
                ", tipoConta=" + tipoConta +
                ", tipoRH=" + tipoRH +
                ", turno=" + turno +
                '}';
    }
}
