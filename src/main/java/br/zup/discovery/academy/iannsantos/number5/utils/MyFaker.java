package br.zup.discovery.academy.iannsantos.number5.utils;

import br.zup.discovery.academy.iannsantos.number5.Account;
import br.zup.discovery.academy.iannsantos.number5.Client;
import br.zup.discovery.academy.iannsantos.number5.CommonPersonAccount;
import br.zup.discovery.academy.iannsantos.number5.LegalPersonAccount;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class MyFaker {
    private final Faker faker = new Faker();
    private final Integer NUMBER_OF_ACCOUNTS = 10;

    public List<Account> generateCommonPersonAccounts() {
        List<Account> accounts = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_ACCOUNTS; i++) {
            Long accountId = faker.number().randomNumber();
            Long accountNumber = faker.number().randomNumber();
            Double accountBalance = faker.number().randomDouble(2, 10, 100);

            Long clientId = faker.number().randomNumber();
            String name = faker.name().fullName();

            Client client = new Client(clientId, name);
            Account commonPersonAccount = new CommonPersonAccount(accountId, accountNumber, accountBalance, client);
            client.setAccount(commonPersonAccount);

            accounts.add(commonPersonAccount);
        }

        return accounts;
    }

    public List<Account> generateLegalPersonAccounts() {
        List<Account> accounts = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_ACCOUNTS; i++) {
            Long accountId = faker.number().randomNumber();
            Long accountNumber = faker.number().randomNumber();
            Double accountBalance = faker.number().randomDouble(2, 10, 100);

            Long clientId = faker.number().randomNumber();
            String name = faker.name().fullName();

            Client client = new Client(clientId, name);
            Account commonPersonAccount = new LegalPersonAccount(accountId, accountNumber, accountBalance, client);
            client.setAccount(commonPersonAccount);

            accounts.add(commonPersonAccount);
        }

        return accounts;
    }
}
