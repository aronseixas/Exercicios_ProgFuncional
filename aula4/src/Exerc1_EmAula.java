/*
1) Filtragem de dados: dada uma lista de números inteiros
crie uma stream finita e use o método filter para retornar apenas os números pares.
*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exerc1_EmAula {

    public static void main(String[] args) {

//        List<Integer> numero = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        List<Integer> numerosPares = numero.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(numerosPares);

        IntStream stream = IntStream.rangeClosed(1, 10);
        stream.filter(x -> x % 2 == 0).boxed().forEach(System.out::println);
//        System.out.println(numeros);



    }
}
