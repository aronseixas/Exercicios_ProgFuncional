/*5) Crie o objeto Pessoa com os atributos nome:string e idade:integer
        no metodo main inicialize uma lista de pessoas
        use a stream para:
        - filtrar somente pessoas com mais de 18 anos de idade
        - tranformar em uma lista somente dos nomes dessas pessoas
        - limitar a no máximo 3 resultados | limit()
        - e retorne uma lista dessa stream

        imprima essa lista*/

import java.util.List;
import java.util.stream.Collectors;

public class Exerc5_EmAula {

    public static void main(String[] args) {

        List<Person> listaPessoas = List.of(
                new Person("Aron", 12),
                new Person("Paulo", 30),
                new Person("Joao", 25),
                new Person("Maria", 18),
                new Person("Antonia", 40),
                new Person("Carolina", 12));

        List<String> filtragem = listaPessoas.stream()
                .filter(x -> x.idade > 18)
                .map(y -> y.nome)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(filtragem);

    }
}

class Person{
    String nome;
    Integer idade;

    public Person(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
