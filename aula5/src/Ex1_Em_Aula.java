//1. Dado uma lista de inteiros, encontre a soma de todos os números da lista;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex1_Em_Aula {

    public static void main(String[] args) {

        long listaNumeros = LongStream.of(1,2,3,4,5,6,7,8,9,10).sum();

        System.out.println("SOMA: " + listaNumeros);
    }
}
