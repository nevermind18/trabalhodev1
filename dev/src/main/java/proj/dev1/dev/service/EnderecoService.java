package proj.dev1.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.dev1.dev.model.Endereco;
import proj.dev1.dev.repository.EnderecoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public Endereco cadastrar(Endereco endereco){

        return enderecoRepository.save(endereco);
    }

    public Optional<Endereco> buscarPorId(long id){
        return enderecoRepository.findById(id);
    }

    public List<Endereco> listarTodos(){

        return enderecoRepository.findAll();
    }

    public Endereco alterar(Endereco endereco){

        return enderecoRepository.save(endereco);
    }

    public void deletar(Endereco endereco){

        enderecoRepository.delete(endereco);
    }
}
