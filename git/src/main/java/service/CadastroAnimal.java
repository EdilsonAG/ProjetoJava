package service;
import java.util.ArrayList;
import java.util.List;

import com.testegit.produtos.Animal;
import com.testegit.produtos.Cadastro;
import com.testegit.produtos.Produto;


public class CadastroAnimal implements Cadastro {

    List<Animal> animals = new ArrayList<>();    

    @Override
    public void salvarCadastro(Produto produto) {
        Animal animal = new Animal();
        animal.setNome(produto.getNome());
        animals.add(animal);
    }
    
}
