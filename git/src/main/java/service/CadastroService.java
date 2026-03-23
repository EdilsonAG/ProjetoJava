package service;

import java.util.ArrayList;
import java.util.List;

import com.testegit.produtos.Cadastro;
import com.testegit.produtos.Produto;
import com.testegit.repositorio.SalvarLocal;

public class CadastroService implements Cadastro{
    
    private SalvarLocal salvarLocal = new SalvarLocal();
    public CadastroService(SalvarLocal salvarLocal){
        this.salvarLocal = salvarLocal;
    }

    public CadastroService(){
       
    }
 
    public void salvarCadastro(Produto spjf){
        salvarLocal.salvar(spjf);
    }
}
