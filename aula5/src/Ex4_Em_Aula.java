//4. Dado uma lista de transações, encontre o total de transações por cliente;
//
//        Transacao: jorge, 10
//        Transacao: maria, 20
//        Transacao: jorge, 5
//
//        resultado: Map -> jorge=15, maria=20


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex4_Em_Aula {

    public static void main(String[] args) {

        List<Transacoes> transacoes = List.of(
                new Transacoes("jorge", 10),
                new Transacoes("maria", 20),
                new Transacoes("jorge", 5));

        var lista = transacoes
                .stream()
                .collect(Collectors.toMap(
                        Transacoes -> Transacoes.nome,
                        Transacoes -> Transacoes.numeroTransacoes,
                        Integer::sum));

        System.out.println("Lista: " + lista);

    }
}

class Transacoes{

    String nome;
    Integer numeroTransacoes;

    public Transacoes(String nome, Integer transacoes) {
        this.nome = nome;
        this.numeroTransacoes = transacoes;
    }
}