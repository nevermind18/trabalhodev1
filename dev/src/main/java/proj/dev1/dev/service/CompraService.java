package proj.dev1.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.dev1.dev.model.Compra;
import proj.dev1.dev.repository.CompraRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    CompraRepository compraRepository;

    public Compra cadastrar(Compra compra){

        return compraRepository.save(compra);
    }

    public Optional<Compra> buscarPorId(long id){
        return compraRepository.findById(id);
    }

    public List<Compra> listarTodos(){

        return compraRepository.findAll();
    }

    public Compra alterar(Compra compra){

        return compraRepository.save(compra);
    }

    public void deletar(Compra compra){

        compraRepository.delete(compra);
    }

}
