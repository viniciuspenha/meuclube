package br.com.desbravadores.meuclube.controller;

import br.com.desbravadores.meuclube.model.Unidade;
import br.com.desbravadores.meuclube.service.UnidadeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/unidade")
@Api("Unidade")
public class UnidadeController {

    @Autowired
    private UnidadeService unidadeService;

    @GetMapping("/{id}")
    @ApiOperation("Busca uma unidade")
    public Unidade buscar(@PathVariable String id) {
        return unidadeService.buscar(id);
    }

    @PostMapping
    @ApiOperation("Cria uma unidade")
    public void criar(@RequestBody Unidade unidade) {
        unidadeService.salvar(unidade);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Deleta uma unidade")
    public void deletar(@PathVariable String id) {
        unidadeService.deletar(id);
    }
}