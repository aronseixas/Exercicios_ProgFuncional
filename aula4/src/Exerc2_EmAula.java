//        2) Agregação de dados: dada uma lista de números inteiros
//        crie uma stream finita e use o método reduce para calcular a soma de todos os números.

import java.util.List;
import java.util.stream.IntStream;

public class Exerc2_EmAula {

    public static void main(String[] args) {

        IntStream listaNumeros = IntStream.rangeClosed(1, 10);
        Integer total = listaNumeros.reduce(0, (x,y) -> x +y);
        System.out.println(total);

    }
}
