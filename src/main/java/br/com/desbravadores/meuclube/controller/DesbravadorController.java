package br.com.desbravadores.meuclube.controller;

import br.com.desbravadores.meuclube.model.Desbravador;
import br.com.desbravadores.meuclube.service.DesbravadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/desbravador")
public class DesbravadorController {

    @Autowired
    private DesbravadorService desbravadorService;

    @GetMapping("/{id}")
    public Desbravador buscarDesbravador(@PathVariable String id) {
        return desbravadorService.buscar(id);
    }

    @PostMapping
    public void salvarDesbravador(@RequestBody Desbravador desbravador) {
        desbravadorService.salvar(desbravador);
    }

    @DeleteMapping("/{id}")
    public void deletarDesbravador(@PathVariable String id) {
        desbravadorService.deletar(id);
    }
}