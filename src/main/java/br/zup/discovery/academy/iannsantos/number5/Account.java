package br.zup.discovery.academy.iannsantos.number5;

import java.util.Objects;

public abstract class Account {
    private Long id;
    private Long number;
    private Double balance;
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "ID: " + id + " NUMBER: " + number + " BALANCE: " + String.format("%.2f", balance) + " CLIENT: (" + client.toString() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) &&
                Objects.equals(number, account.number) &&
                Objects.equals(balance, account.balance) &&
                Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, balance, client);
    }
}
