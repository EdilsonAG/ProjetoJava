package com.testegit;

import java.util.Scanner;

import com.testegit.produtos.Produto;

import service.CadastroService;

public class Main {
    public static void main(String[] args) {

        CadastroService cadastroService = new CadastroService();

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1 é cadastrar produto");
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