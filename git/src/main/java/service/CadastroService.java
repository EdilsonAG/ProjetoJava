package service;

import java.util.ArrayList;
import java.util.List;

import com.testegit.produtos.Cadastro;
import com.testegit.produtos.Produto;

public class CadastroService implements Cadastro{
    
    List<Produto> produtos = new ArrayList<>();

    public void salvarCadastro(Produto spjf){
        produtos.add(spjf);
    }
}
