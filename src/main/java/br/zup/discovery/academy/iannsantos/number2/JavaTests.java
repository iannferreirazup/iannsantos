package br.zup.discovery.academy.iannsantos.number2;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class JavaTests {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.preco = 10;

        Produto p2 = new Produto();
        p2.preco = 30;

        List<Produto> produtos = Arrays.asList(p1, p2);

        ToIntFunction<Produto> justPrice = produto -> produto.preco;

        Integer somaPrecoProdutos = produtos.stream().mapToInt(justPrice).sum();

        System.out.println(somaPrecoProdutos);
    }


    static class Produto {
        Integer preco;
        }
}
