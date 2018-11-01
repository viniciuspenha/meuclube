package br.com.desbravadores.meuclube.controller;

import br.com.desbravadores.meuclube.model.Evento;
import br.com.desbravadores.meuclube.service.EventoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/evento")
@Api("Evento")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping("/{id}")
    @ApiOperation("Busca um evento")
    public Evento buscar(@PathVariable String id) {
        return eventoService.buscar(id);
    }

    @PostMapping
    @ApiOperation("Cria um evento")
    public void criar(@RequestBody Evento evento) {
        eventoService.salvar(evento);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Deleta um evento")
    public void deletar(@PathVariable String id) {
        eventoService.deletar(id);
    }
}