//3. Dado uma lista de funcionarios, calcule a média de salário por departamento;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Ex3_Em_Aula {

    public static void main(String[] args) {
        List<Funcionarios> funcionarios = List.of(
                new Funcionarios("joao", 2100, Funcionarios.Departamento.RH),
                new Funcionarios("marcelo", 1700, Funcionarios.Departamento.FINANCEIRO),
                new Funcionarios("maria", 3300, Funcionarios.Departamento.RH),
                new Funcionarios("marcela", 4300, Funcionarios.Departamento.FINANCEIRO),
                new Funcionarios("caio", 1100, Funcionarios.Departamento.FINANCEIRO),
                new Funcionarios("Icaro", 1900, Funcionarios.Departamento.TI),
                new Funcionarios("Alberto", 1900, Funcionarios.Departamento.FINANCEIRO),
                new Funcionarios("joana", 1500, Funcionarios.Departamento.TI));


        //Forma 1 - Fiz somente para uma, faltam as demais categorias. Aqui foi sem enum

//        Double funcionariosStream = funcionarios
//                .stream()
//                .filter(x -> x.departamento.equals("RH"))
//                .mapToDouble(y -> y.salario)
//                .average().
//                getAsDouble();
//
//        System.out.println("salario: " + funcionariosStream);

        // Forma 2 - Usando enum

        Map<Funcionarios.Departamento, Double> mediaFuncionariosPorDepartamento = funcionarios
                .stream()
                .collect(Collectors.groupingBy(Funcionarios -> Funcionarios.departamento, Collectors.averagingDouble(Funcionarios -> Funcionarios.salario)));

        System.out.println(mediaFuncionariosPorDepartamento);





    }
}

class Funcionarios {

    public String nome;
    public Integer salario;

    public Departamento departamento;

    public Funcionarios(String nome, Integer salario, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public enum Departamento{
        RH, FINANCEIRO, TI
    }
}

