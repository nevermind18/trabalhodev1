package proj.dev1.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.dev1.dev.model.Cliente;
import proj.dev1.dev.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    EnderecoService enderecoService;

    public Cliente cadastrar(Cliente cliente){

        cliente.setEndereco(enderecoService.buscarPorId(cliente.getEndereco().getId()).get());

        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarTodos(){

        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(long id){

        return clienteRepository.findById(id);
    }

    public Cliente alterar(Cliente cliente){

        return clienteRepository.save(cliente);
    }

    public void deletar(Cliente cliente){

        clienteRepository.delete(cliente);
    }

}
