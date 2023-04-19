//2. Dado uma lista de pessoas, agrupe os nomes por idade;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex2_Em_Aula {

    public static void main(String[] args) {

        List<Pessoas> pessoas = List.of(
                        new Pessoas("joao", 21),
                        new Pessoas("marcelo", 17),
                        new Pessoas("maria", 33),
                        new Pessoas("marcela", 43),
                        new Pessoas("caio", 11),
                        new Pessoas("Icaro", 19),
                        new Pessoas("Alberto", 19),
                        new Pessoas("joana", 15));


        //Solução 1

//        String listaPessoasAgrupadas = pessoas.stream().collect(Collectors.groupingBy(pessoas1 -> pessoas1.idade)).toString();
//        System.out.println(listaPessoasAgrupadas);

        //Solução 2

        Map<Integer, List<Pessoas>> agruparPessoas = pessoas
                .stream()
                .collect(Collectors.groupingBy(Pessoas -> Pessoas.idade));

        System.out.println("Agrupamento Pessoas: " + agruparPessoas);

    }

}

class Pessoas {
    public String nome;
    public Integer idade;

    public Pessoas(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoas: {" + nome + '\''  + '}';
    }
}