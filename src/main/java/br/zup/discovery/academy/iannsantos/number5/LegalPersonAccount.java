package br.zup.discovery.academy.iannsantos.number5;

public class LegalPersonAccount extends Account{
    public LegalPersonAccount(Long id, Long number, Double balance, Client client) {
        super.setId(id);
        super.setNumber(number);
        super.setClient(client);
        super.setBalance(balance);
    }
}
