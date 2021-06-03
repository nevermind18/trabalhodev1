package proj.dev1.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proj.dev1.dev.model.Endereco;
import proj.dev1.dev.service.EnderecoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "endereco")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @PostMapping("/")
    public Endereco cadastrar(@RequestBody Endereco endereco){

        return enderecoService.cadastrar(endereco);
    }

    @GetMapping("/")
    public List<Endereco> listarTodos(){

        return enderecoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Endereco> buscarPorId(@PathVariable int id){
        return enderecoService.buscarPorId(id);
    }

    @PutMapping("/")
    public Endereco alterar(@RequestBody Endereco endereco){

        return enderecoService.alterar(endereco);
    }

    @DeleteMapping("/")
    public void deletar(@RequestBody Endereco endereco){

        enderecoService.deletar(endereco);
    }

}
