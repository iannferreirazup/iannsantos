package br.zup.discovery.academy.iannsantos.number3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Proprietario {
    private String nome;
    private String cpf;
    private String rg;
    private Calendar dataNascimento;
    private Endereco endereco;


    public Proprietario(String nome, String cpf, String rg, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }

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

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Integer day, Integer month, Integer year) {
        Calendar dataNascimento = new GregorianCalendar();
        dataNascimento.set(year, month, day);
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
