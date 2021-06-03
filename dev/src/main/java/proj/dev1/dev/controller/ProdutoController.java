package proj.dev1.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proj.dev1.dev.model.Produto;
import proj.dev1.dev.service.ProdutoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping("/")
    public Produto cadatrar(@RequestBody Produto p){

        return produtoService.cadastrar(p);
    }

    @GetMapping("/")
    public List<Produto> listarTodos(){

        return produtoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Produto> buscarPorId(@PathVariable int id){
        return produtoService.buscarPorId(id);
    }

    @PutMapping("/")
    public Produto alterar(@RequestBody Produto p){

        return produtoService.alterar(p);
    }

    @DeleteMapping("/")
    public void deletar(@RequestBody Produto p){
        produtoService.deletar(p);
    }

}
