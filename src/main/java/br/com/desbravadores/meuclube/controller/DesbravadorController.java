package br.com.desbravadores.meuclube.controller;

import br.com.desbravadores.meuclube.model.Desbravador;
import br.com.desbravadores.meuclube.service.DesbravadorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/desbravador")
@Api(value = "Desbravador")
public class DesbravadorController {

    @Autowired
    private DesbravadorService desbravadorService;

    @GetMapping("/{id}")
    @ApiOperation(value = "Buscar um desbravador")
    public Desbravador buscarDesbravador(@PathVariable String id) {
        return desbravadorService.buscar(id);
    }

    @PostMapping
    @ApiOperation(value = "Adicionar um desbravador")
    public void salvarDesbravador(@RequestBody Desbravador desbravador) {
        desbravadorService.salvar(desbravador);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deletar um desbravador")
    public void deletarDesbravador(@PathVariable String id) {
        desbravadorService.deletar(id);
    }
}