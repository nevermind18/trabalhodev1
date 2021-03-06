package proj.dev1.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.dev1.dev.model.Fornecedor;
import proj.dev1.dev.model.Produto;
import proj.dev1.dev.repository.ProdutoRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    FornecedorService fornecedorService;

    public Produto cadastrar(Produto p){

        p.setFornecedor(fornecedorService.buscarPorId(p.getFornecedor().getId()).get());

        return produtoRepository.save(p);
    }

    public Optional<Produto> buscarPorId(long id){
        return produtoRepository.findById(id);
    }

    public List<Produto> listarTodos(){

        return produtoRepository.findAll();
    }

    public Produto alterar(Produto p){

        return produtoRepository.save(p);
    }

    public void deletar(Produto p){

        produtoRepository.delete(p);
    }

}
