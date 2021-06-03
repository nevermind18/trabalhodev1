package proj.dev1.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proj.dev1.dev.model.Cliente;
import proj.dev1.dev.service.ClienteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/")
    public Cliente cadatrar(@RequestBody Cliente cliente){

        return clienteService.cadastrar(cliente);
    }

    @GetMapping("/")
    public List<Cliente> listarTodos(){

        return clienteService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> buscarPorId(@PathVariable int id){
        return clienteService.buscarPorId(id);
    }

    @PutMapping("/")
    public Cliente alterar(@RequestBody Cliente cliente){

        return clienteService.alterar(cliente);
    }

    @DeleteMapping("/")
    public void deletar(@RequestBody Cliente cliente){

        clienteService.deletar(cliente);
    }

}