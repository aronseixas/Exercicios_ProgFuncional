/*      4) Ordenação de dados: dada uma lista de números inteiros
        crie uma stream finita e use o método sorted para classificá-los em ordem crescente.*/

import java.util.List;
import java.util.stream.Collectors;

public class Exerc4_EmAula {

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 6, 3, 7, 2, 8, 12, 10, 9);
        System.out.println(lista.stream().sorted().collect(Collectors.toList()));
    }
}
