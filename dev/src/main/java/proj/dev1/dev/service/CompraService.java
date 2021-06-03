package proj.dev1.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proj.dev1.dev.model.Compra;
import proj.dev1.dev.service.CompraService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/Compra")
public class CompraController {

    @Autowired
    CompraService compraService;

    @PostMapping("/")
    public Compra cadastrar(@RequestBody Compra compra){

        return compraService.cadastrar(compra);
    }

    @GetMapping("/")
    public List<Compra> listarTodos(){

        return compraService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Compra> buscarPorId(@PathVariable int id){
        return compraService.buscarPorId(id);
    }

    @PutMapping("/")
    public Compra alterar(@RequestBody Compra compra){

        return compraService.alterar(compra);
    }

    @DeleteMapping("/")
    public void deletar(@RequestBody Compra compra){

        compraService.deletar(compra);
    }

}
