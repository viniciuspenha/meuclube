package br.com.desbravadores.meuclube.controller;

import br.com.desbravadores.meuclube.model.Pagamento;
import br.com.desbravadores.meuclube.service.PagamentoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamento")
@Api("Pagamento")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping("/{id}")
    @ApiOperation("Busca um pagamento")
    public Pagamento buscar(@PathVariable String id) {
        return pagamentoService.buscar(id);
    }

    @PostMapping
    @ApiOperation("Cria um pagamento")
    public void criar(@RequestBody Pagamento pagamento) {
        pagamentoService.salvar(pagamento);
    }
}