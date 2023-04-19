//6. Dado uma lista de numeros, encontre o segundo maior número;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex6_Em_Aula {

    public static void main(String[] args) {

        var listaNumeros = List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println(listaNumeros.stream().sorted((a, b) -> Integer.compare(b,a)).skip(1).collect(Collectors.toList()).get(0));

    }

}
