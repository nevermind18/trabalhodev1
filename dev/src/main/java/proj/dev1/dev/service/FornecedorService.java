package proj.dev1.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.dev1.dev.model.Fornecedor;
import proj.dev1.dev.repository.FornecedorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    FornecedorRepository fornecedorRepository;

    @Autowired
    EnderecoService enderecoService;

    public Fornecedor cadastrar(Fornecedor fornecedor){

        fornecedor.setEndereco(enderecoService.buscarPorId(fornecedor.getEndereco().getId()).get());

        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> listarTodos(){

        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> buscarPorId(long id){

        return fornecedorRepository.findById(id);
    }

    public Fornecedor alterar(Fornecedor fornecedor){

        return fornecedorRepository.save(fornecedor);
    }

    public void deletar(Fornecedor fornecedor){

        fornecedorRepository.delete(fornecedor);
    }

}
