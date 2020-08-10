package br.zup.discovery.academy.iannsantos.number5;

import br.zup.discovery.academy.iannsantos.number5.exceptions.NoBalanceException;
import br.zup.discovery.academy.iannsantos.number5.utils.MyFaker;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Faker faker = new Faker();
        MyFaker myFaker = new MyFaker();
        Services services = new Services();

        List<Account> commonPersonAccounts = myFaker.generateCommonPersonAccounts();
        List<Account> legalPersonAccounts = myFaker.generateLegalPersonAccounts();

        List<Account> allAccounts = new ArrayList<>();
        allAccounts.addAll(legalPersonAccounts);
        allAccounts.addAll(commonPersonAccounts);

        allAccounts.forEach(System.out::println);

        System.out.println("\n\n___________________DEPOSITO_________________________\n\n");

        allAccounts.forEach((account) -> {
            System.out.println("ANTES: " + account);
            services.deposit(faker.number().randomDouble(2, 10, 1000), account);
            System.out.println("DEPOIS: " + account + "\n\n");
        });

        System.out.println("\n\n___________________TRANSFERENCIA_________________________\n\n");

        for (int i = 0; i < allAccounts.size(); i++) {
            System.out.println("ANTES: " + allAccounts.get(i));

            try {
                if (i == allAccounts.size() - 1) {
                    services.transfer(
                            faker.number().randomDouble(2, 10, 1000),
                            allAccounts.get(i),
                            allAccounts.get(0)
                    );
                } else {
                    services.transfer(
                            faker.number().randomDouble(2, 10, 1000),
                            allAccounts.get(i),
                            allAccounts.get(i + 1)
                    );
                }
            } catch (NoBalanceException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("DEPOIS: " + allAccounts.get(i) + "\n\n");
            }
        }

        System.out.println("\n\n___________________SAQUE_________________________\n\n");

        List<Account> canWithdraw = new ArrayList<>();
        List<Account> canNotWithdraw = new ArrayList<>();

        allAccounts.forEach(account -> {
            try {
                services.withdraw(account.getBalance() * 0.9, account);

                canWithdraw.add(account);
            } catch (NoBalanceException e) {
                canNotWithdraw.add(account);
                System.out.println(e.getMessage());
            }
        });

    }
}
