package br.zup.discovery.academy.iannsantos.number3;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Testes {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario("Iann", "123.456.789-00", "MG123456789", new Endereco());
        proprietario1.setDataNascimento(20, 5, 1998);
        Proprietario proprietario2 = new Proprietario("Iann", "123.456.789-00", "MG123456789", new Endereco());
        proprietario2.setDataNascimento(12, 4, 1981);
        Proprietario proprietario3 = new Proprietario("Iann", "123.456.789-00", "MG123456789", new Endereco());
        proprietario3.setDataNascimento(1, 12, 1989);
        Proprietario proprietario4 = new Proprietario("Iann", "123.456.789-00", "MG123456789", new Endereco());
        proprietario4.setDataNascimento(22, 2, 1976);
        Proprietario proprietario5 = new Proprietario("Iann", "123.456.789-00", "MG123456789", new Endereco());
        proprietario5.setDataNascimento(30, 1, 2000);

        Carro carro1 = new Carro("458 Itália", "Vermelho", 2015, "Ferrari", proprietario1, 2);
        Carro carro2 = new Carro("Gol", "Vermelho", 2015, "Volkswagen", proprietario4, 4);
        Carro carro3 = new Carro("Uno", "Cinza", 2015, "Fiat", proprietario2, 2);
        Carro carro4 = new Carro("Uno", "Preto", 2020, "Fiat", proprietario4, 4);
        Carro carro5 = new Carro("Onix", "Branco", 2014, "Chevrolet", proprietario5, 4);
        Carro carro6 = new Carro("Palio", "Vermelho", 2012, "Fiat", proprietario2, 2);
        Carro carro7 = new Carro("Strada", "Preto", 2010, "Fiat", proprietario1, 2);
        Carro carro8 = new Carro("Fox", "Vermelho", 2015, "Volkswagen", proprietario3, 4);
        Carro carro9 = new Carro("HB20", "Vermelho", 2018, "Hyundai", proprietario3, 4);
        Carro carro10 = new Carro("HB20", "Vermelho", 2020, "Hyundai", proprietario5, 4);

        List<Carro> carros = Arrays.asList(carro1, carro2, carro3, carro4, carro5, carro6, carro7, carro8, carro9, carro10);

//        c.3
        Predicate<Carro> startsWithU = (carro) -> carro.getModelo().startsWith("U");
        List<Carro> c3 = carros.stream().filter(startsWithU).collect(Collectors.toList());

//        c.4
        Calendar yearToCompare = new GregorianCalendar();
        yearToCompare.set(Calendar.YEAR, 1990);

        Predicate<Carro> yearOfOwnerGraterThan1990 = carro -> carro.getProprietario().getDataNascimento().after(yearToCompare);
        Predicate<Carro> has4Doors = carro -> carro.getNumeroDePortas().equals(4);

        List<Carro> c4 = carros.stream()
                .filter(yearOfOwnerGraterThan1990)
                .filter(has4Doors)
                .collect(Collectors.toList());

//        c.5
        Map<String, Carro> c5 = new HashMap<>();
        carros.forEach(carro -> c5.put(carro.getModelo(), carro));

//        c.6
        Map<String, List<Carro>> c6 = new HashMap<>();
        carros.forEach(carro -> {
            if (c6.containsKey(carro.getMarca())) {
                c6.get(carro.getMarca()).add(carro);
            } else {
               List<Carro> cars = new ArrayList<>();
               cars.add(carro);

               c6.put(carro.getMarca(), cars);
            }
        });

//        c.7
        Set<String> c7 = new HashSet<>();
        c6.forEach((marca, listaDeCarros) -> c7.add(marca));
    }
}
