/*      3) Transformação de dados: dada uma lista de strings
        crie uma stream finita e use o método map para convertê-las em números inteiros.*/

import java.util.List;
import java.util.stream.Collectors;

public class Exerc3_EmAula {

    public static void main(String[] args) {

        List<String > listaString = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");

        List<Integer> listaInteger = listaString.stream()
                .map(string  -> Integer.parseInt(string))
                .collect(Collectors.toList());

        System.out.println(listaInteger);
    }
}
