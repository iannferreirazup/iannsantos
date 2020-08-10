package br.zup.discovery.academy.iannsantos.number5;

public class CommonPersonAccount extends Account {
    public CommonPersonAccount(Long id, Long number, Double balance, Client client) {
        super.setId(id);
        super.setNumber(number);
        super.setClient(client);
        super.setBalance(balance);
    }
}
