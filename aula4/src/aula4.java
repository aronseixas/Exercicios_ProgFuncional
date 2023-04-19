import javax.swing.text.html.Option;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class aula4 {

    public static void main(String[] args) {

        // INFINITAS
        //Stream infinitas. É feita a partir de uma fonte de dados que n tem fim

        //Stream.generate(LocalTime::now).forEach(System.out::println);

        //Stream.iterate(1, n -> n+1).forEach(System.out::println);

        //Stream.iterate(2, (num)-> num < 100, n -> n + 2).forEach(System.out::println);



        //FINITAS

        //Stream Vazia
        //Stream<String> streamVazia = Stream.empty();

        //Stream of.
        //Stream<Integer> streamDeUmElemento = Stream.of(4);

        //Posso passar uma lista de números
        //List<Integer> lista = List.of(1,2,3,4,5,6,7,8,9);

        //System.out.println(lista.stream().filter((num) -> num %2 == 0 ).count());
        //System.out.println(lista.stream().filter((num) -> num %2 != 0 ).count());
        //List<Integer> listinha = lista.stream().filter((num) -> num %2 == 0).collect(Collectors.toList());
        //System.out.println(listinha);

        //Criei um Stream a partir de uma lista;
        //Stream.of(lista);

        //OPERACOES TERMINAIS

        //foreach
        //count
        //List<Integer> lista = List.of(1,2,3,4,5,6,7,8,9);

        //System.out.println(lista.stream().filter((num) -> num %2 == 0 ).count());
        //System.out.println(lista.stream().filter((num) -> num %2 != 0 ).count());

        //consumibdi e reutilizando a stream.

        //var nomes = List.of("joao", "jorge", "maria", "mario");

        //Stream<String> stramNomes = nomes.stream();
        //System.out.println(stramNomes.count());

        //long quant = stramNomes.count();
        //System.out.println(quant);

        //OPTIONAL

        //Criei um texto
        String txt = "txt";

//        Optional<Integer> comprimento = Optional.ofNullable(txt).map(String::length);
//
//        if(comprimento.isPresent()){
//            Integer tamanho = comprimento.get();
//            System.out.println(tamanho);
//        }

//        Endereco endereco = new Endereco();
//        endereco.rua = "alagoas";
//
//        Pessoa dono = new Pessoa();
//        dono.nome = "joao";
//        dono.endereco = endereco;
//
//        Carro carro = new Carro();
//        carro.dono = dono;
//        carro.modelo = "HB20";
//
//        //String end= carro.dono.endereco.rua;
//        //System.out.println(end);
//
//        Optional<String> optionalS = Optional.of(carro)
//                .map(x -> x.dono)
//                .map(y -> y.endereco)
//                .map(z -> z.rua);
//
//        if(optionalS.isPresent()){
//            String enderecoDono = optionalS.get();
//            System.out.println(enderecoDono);
//        }

//      var carros= List.of(new Carro("audi q3"), new Carro("audi a5"), new Carro("BMW M3"));
//
//        Optional<Carro> op = carros.stream().findFirst();
//        if(op.isPresent()){
//            Carro primeiro = op.get();
//            System.out.println(primeiro.modelo);
//        }


        // allMatch(Predicate), anyMatch(Predicate), noneMatch(Predicate).

//        Stream<Carro> carroStream = carros.stream();
//
//        boolean isTodosOsCarrosTemDono = carroStream.allMatch((carro -> carro.dono != null));
//        System.out.println("Todos os carros tem dono? " + isTodosOsCarrosTemDono);
//
//        boolean isAlgumCarroTemDono = carros.stream().anyMatch((carro -> carro.dono != null));
//        System.out.println("Algum carros tem dono? " + isAlgumCarroTemDono);
//
//        boolean isAlgumCarroNaoTemDono = carros.stream().anyMatch((carro -> carro.dono == null));
//        System.out.println("Algum carros não tem dono? " + isAlgumCarroNaoTemDono);
//
//        boolean isNenhumCarroTemDono = carros.stream().noneMatch(carro -> carro.dono != null);
//        System.out.println("Nenhum tem dono? " + isAlgumCarroNaoTemDono);

        //Reduce()

        List<Integer> numeros = List.of(2,4,6);

        Integer reduzido = numeros.stream().reduce(0, (x,y) -> (x + y) );
        System.out.println(reduzido);

    }
}

class Carro{
    String modelo;
    Pessoa dono;

    public Carro(String modelo) {
        this.modelo = modelo;
    }
    public Carro(){}
}

class Pessoa{
    String nome;
    Endereco endereco;
}

class Endereco{
    String rua;
}





