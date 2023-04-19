import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Aula5_2 {

    public static void main(String[] args) {

        // int, short, byte, char
        IntStream.of(1,2,3,4,5,6);

        System.out.println(IntStream.range(1,100).sum());


        // long
        LongStream.of(2L);

        //double, float
        DoubleStream.of(2.0);

        //boxed

        IntStream intStream = IntStream.rangeClosed(0,9);

        Stream<Integer> boxed = intStream.boxed();

        // mapToObject
        //Faz a mesma coisa do boxed, mas ele passa com aluguma coisa a mais.


        //Optional de primitivos

        //OptionalDouble
        //OptionalInt
        //OptionalLong







    }


}
