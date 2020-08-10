package br.zup.discovery.academy.iannsantos.number3;

public class Carro {
    private String modelo;
    private String cor;
    private Integer ano;
    private String marca;
    private String chassi;
    private Proprietario proprietario;
    private Integer velocidadeMaxima;
    private Integer velocidadeAtual;
    private Integer numeroDePortas;
    private Boolean temTetoSolar;
    private Integer numeroDeMarchas;
    private Boolean temCambioAutomatico;
    private Double volumeDeCombustivel;

    public Carro(String modelo, String cor, Integer ano, String marca, Proprietario proprietario, Integer numeroDePortas) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.proprietario = proprietario;
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", marca='" + marca + '\'' +
                ", chassi='" + chassi + '\'' +
                ", proprietario=" + proprietario +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadeAtual=" + velocidadeAtual +
                ", numeroDePortas=" + numeroDePortas +
                ", temTetoSolar=" + temTetoSolar +
                ", numeroDeMarchas=" + numeroDeMarchas +
                ", temCambioAutomatico=" + temCambioAutomatico +
                ", volumeDeCombustivel=" + volumeDeCombustivel +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Boolean getTemTetoSolar() {
        return temTetoSolar;
    }

    public void setTemTetoSolar(Boolean temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }

    public Integer getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(Integer numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public Boolean getTemCambioAutomatico() {
        return temCambioAutomatico;
    }

    public void setTemCambioAutomatico(Boolean temCambioAutomatico) {
        this.temCambioAutomatico = temCambioAutomatico;
    }

    public Double getVolumeDeCombustivel() {
        return volumeDeCombustivel;
    }

    public void setVolumeDeCombustivel(Double volumeDeCombustivel) {
        this.volumeDeCombustivel = volumeDeCombustivel;
    }
}
