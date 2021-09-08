package br.com.alura.spring.data.service;

import br.com.alura.spring.data.orm.Funcionario;
import br.com.alura.spring.data.repository.FuncionarioRepository;
import br.com.alura.spring.data.specification.SpecificationFuncionario;
import org.springframework.data.jpa.domain.Specification;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class RelatorioFuncionarioDinamico {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final FuncionarioRepository funcionarioRepository;

    public RelatorioFuncionarioDinamico(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public void inicial(Scanner scanner) {
        System.out.println("Digite o nome");
        String nome = scanner.next();

        if(nome.equalsIgnoreCase("NULL")) {
            nome = null;
        }

        System.out.println("Digite o nome");
        String cpf = scanner.next();

        if(cpf.equalsIgnoreCase("NULL")) {
            cpf = null;
        }

        System.out.println("Digite o nome");
        Double salario = scanner.nextDouble();

        if(salario == 0) {
            salario = null;
        }

        System.out.println("Digite o nome");
        String data = scanner.next();

        LocalDate dataContracao;
        if(data.equalsIgnoreCase("NULL")) {
            dataContracao = null;
        } else {
            dataContracao = LocalDate.parse(data, formatter);
        }

        List<Funcionario> funcionarios = funcionarioRepository.findAll(Specification.where(
                SpecificationFuncionario.nome(nome))
                .or(SpecificationFuncionario.cpf(cpf))
                .or(SpecificationFuncionario.salario(salario))
                .or(SpecificationFuncionario.dataContracao(dataContracao)));
        funcionarios.forEach(System.out::println);
    }
}
