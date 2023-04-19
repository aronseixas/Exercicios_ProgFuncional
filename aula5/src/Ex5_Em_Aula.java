//5. Dado uma lista de livros, encontre o autor mais popular baseado na quantidade de livros vendidos;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex5_Em_Aula {

    public static void main(String[] args) {

        List<Livro> prateleira = List.of(
                new Livro("Nome1", "Autor1", 15 ),
                new Livro("Nome2", "Autor2", 5 ),
                new Livro("Nome3", "Autor3", 10 ),
                new Livro("Nome4", "Autor4", 12 ),
                new Livro("Nome5", "Autor1", 25 ),
                new Livro("Nome6", "Autor3", 4 ),
                new Livro("Nome7", "Autor3", 2 )
        );

        Map<String, Integer> popular = prateleira
                .stream()
                .collect(Collectors.groupingBy(
                        x-> x.autor,
                        Collectors.summingInt(y -> y.qtde)
                        )
                );


        Map.Entry<String, Integer> stringIntegerEntry = popular
                .entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .collect(Collectors.toList())
                .get(0);

        System.out.println("Autor mais popular: " + stringIntegerEntry);

    }
}

class Livro{
    String nome;
    String autor;
    Integer qtde;

    public Livro(String nome, String autor, Integer qtde) {
        this.nome = nome;
        this.autor = autor;
        this.qtde = qtde;
    }
}