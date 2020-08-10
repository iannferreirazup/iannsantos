package br.zup.discovery.academy.iannsantos.number5;

import br.zup.discovery.academy.iannsantos.number5.exceptions.NoBalanceException;

public class Services {
    public void deposit (Double value, Account account) {
        account.setBalance(account.getBalance() + value);
    }

    public void withdraw (Double value, Account account) throws NoBalanceException {
        Double bankFee = 0.0;
        if (account instanceof CommonPersonAccount) {
            bankFee = 2.5;
        } else if (account instanceof LegalPersonAccount) {
            bankFee = 3.7;
        }

        Double totalWithBankFee = value + bankFee;

        if (account.getBalance() > totalWithBankFee) {
            account.setBalance(account.getBalance() - totalWithBankFee);
        } else {
            throw new NoBalanceException("withdraw");
        }
    }

    public void transfer (Double value, Account originAccount, Account targetAccount) throws NoBalanceException {
        if (originAccount.getBalance() > value) {
            originAccount.setBalance(originAccount.getBalance() - value);
            targetAccount.setBalance(targetAccount.getBalance() + value);
        } else {
            throw new NoBalanceException("transfer");
        }
    }
}
