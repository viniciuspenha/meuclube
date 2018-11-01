package br.com.desbravadores.meuclube.service;

import br.com.desbravadores.meuclube.model.Pagamento;
import br.com.desbravadores.meuclube.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public Pagamento buscar(String id) {
        return pagamentoRepository.findOne(id);
    }

    public void salvar(Pagamento pagamento) {
        pagamentoRepository.save(pagamento);
    }
}