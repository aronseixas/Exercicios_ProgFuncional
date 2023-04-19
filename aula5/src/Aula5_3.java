import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aula5_3 {

    public static void main(String[] args) {

        Stream<String> alimentosStream = Stream.of("feijao", "arroz", "agua", "carne");

        //Transformar em uma lista
        //List<String> collect = alimentosStream.collect(Collectors.toList());

        //os elementos separados por vírgula -> joining
//        String alimentosString = alimentosStream.collect(Collectors.joining("; "));
//        System.out.println(alimentosString);


        // número de letras médias das palavras.
//        double media = alimentosStream.mapToInt(alimento -> alimento.length())
//                .average()
//                .getAsDouble();
//
//        System.out.println(media);
//
//        // outro méodo para fazer isso

//        double average = alimentosStream.collect(Collectors.averagingInt(String::length));

//        Set<String> collect = alimentosStream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(collect);

        //transformar em map (chave-valor)

//        Map<Integer, String> collect = alimentosStream.collect(Collectors.toMap(String::length, Function.identity()));
//        System.out.println(collect);

        //Caso eu faã uma lista de chave-valor e possua duas chaves identicas eu posso passar um terceiro argumento que dita uma condicional

//        Map<Integer, String> collect = alimentosStream.collect(Collectors.toMap(String::length, Function.identity(), (a,b) -> a + "| " + b));
//        System.out.println(collect);







    }


}
