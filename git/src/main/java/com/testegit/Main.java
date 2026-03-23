package com.testegit;

import java.util.Scanner;

import com.testegit.produtos.Cadastro;
import com.testegit.produtos.Produto;
import com.testegit.repositorio.SalvarLocal;

import service.CadastroAnimal;
import service.CadastroService;

 

public class Main {
    public static void main(String[] args) {

        SalvarLocal salvarLocal = new SalvarLocal();
        

        Cadastro cadastroService = new CadastroService();

        Cadastro cadastro = new CadastroAnimal();

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1 é cadastrar produto 2 É ANIMAL");
            int i = scan.nextInt();

            switch (i) {
                case 1:
                    Produto produto = new Produto();
                    Scanner produtoScan = new Scanner(System.in);

                    System.out.println("nome produto");
                    String nome = produtoScan.nextLine();

                    produto.setNome(nome);
                    cadastroService.salvarCadastro(produto);
                    break;
                case 2:

                Produto produto2 = new Produto();
                    Scanner produtoScan2 = new Scanner(System.in);

                    System.out.println("nome produto");
                    String nome2 = produtoScan2.nextLine();

                    produto2.setNome(nome2);
                    cadastroService.salvarCadastro(produto2);

                    break;
                case 3:

                    break;

                default:
                    scan.close();
                    break;
            }
        }

    }
}