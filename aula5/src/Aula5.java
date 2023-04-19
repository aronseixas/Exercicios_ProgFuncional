import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aula5 {

    public static void main(String[] args) {

        //distinct
        //pega os valores distintos
//        var listaDistintos = Stream.of(1,2,5,8,3,4,5,6,7,6,5,4,3,2,1)
//                .distinct()
//                .sorted()
//                .skip(1)
//                .limit(3)
//                .collect(Collectors.toList());
//
//        System.out.println(listaDistintos);


        // map(Function#apply)

        //peek(Consumer#accept)

//        List<String> nomes = List.of("jose", "maria");
//
//        long qtd = nomes.stream()
//                .filter(nome -> true)
//                .peek( __ -> System.out.println("Processando pessoas .... ")) // o método só é executado quando tem um método intermediário E um final.
//                .count();
//
//        System.out.println("qtde: " + qtd);

        //flatMap

//        Stream<Integer> umdoistres = Stream.of(1,2,3);
//        Stream<Integer> quatroCincoSeis = Stream.of(4,5,6);
//        Stream<Integer> seteOitoNove = Stream.of(7,8,9);
//
//        Stream.of(umdoistres, quatroCincoSeis, seteOitoNove)
//                .flatMap(Function.identity())
//                .forEach(System.out::println);
    }
}
