package com.testegit.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.testegit.produtos.Produto;

public class SalvarLocal {
    List<Produto> pr = new ArrayList<>();
    
    public void salvar(Produto produto){
        pr.add(produto);
    };
}
