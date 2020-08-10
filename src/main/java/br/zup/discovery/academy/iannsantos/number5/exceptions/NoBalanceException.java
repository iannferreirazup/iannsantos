package br.zup.discovery.academy.iannsantos.number5.exceptions;

public class NoBalanceException extends Exception {
    public NoBalanceException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "No balance available for " + super.getMessage();
    }
}
