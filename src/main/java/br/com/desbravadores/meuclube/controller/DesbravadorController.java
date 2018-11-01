package br.com.desbravadores.meuclube.controller;

import br.com.desbravadores.meuclube.model.Desbravador;
import br.com.desbravadores.meuclube.service.DesbravadorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/desbravador")
@Api("Desbravador")
public class DesbravadorController {

    @Autowired
    private DesbravadorService desbravadorService;

    @GetMapping("/{id}")
    @ApiOperation("Busca um desbravador")
    public Desbravador buscar(@PathVariable String id) {
        return desbravadorService.buscar(id);
    }

    @PostMapping
    @ApiOperation("Cria um desbravador")
    public void criar(@RequestBody Desbravador desbravador) {
        desbravadorService.salvar(desbravador);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Deleta um desbravador")
    public void deletar(@PathVariable String id) {
        desbravadorService.deletar(id);
    }
}