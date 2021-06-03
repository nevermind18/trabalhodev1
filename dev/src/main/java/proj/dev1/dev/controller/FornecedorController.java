package proj.dev1.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proj.dev1.dev.model.Fornecedor;
import proj.dev1.dev.service.FornecedorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/fornecedor")
public class FornecedorController {

    @Autowired
    FornecedorService fornecedorService;

    @PostMapping("/")
    public Fornecedor cadatrar(@RequestBody Fornecedor fornecedor){

        return fornecedorService.cadastrar(fornecedor);
    }

    @GetMapping("/")
    public List<Fornecedor> listarTodos(){

        return fornecedorService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Fornecedor> buscarPorId(@PathVariable int id){

        return fornecedorService.buscarPorId(id);
    }

    @PutMapping("/")
    public Fornecedor alterar(@RequestBody Fornecedor fornecedor){

        return fornecedorService.alterar(fornecedor);
    }

    @DeleteMapping("/")
    public void deletar(@RequestBody Fornecedor fornecedor){

        fornecedorService.deletar(fornecedor);
    }

}
