package br.com.desbravadores.meuclube.service;

import br.com.desbravadores.meuclube.model.Unidade;
import br.com.desbravadores.meuclube.repository.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnidadeService {

    @Autowired
    private UnidadeRepository unidadeRepository;

    public void salvar(Unidade unidade) {
        unidadeRepository.save(unidade);
    }

    public void deletar(String id) {
        unidadeRepository.delete(id);
    }

    public Unidade buscar(String id) {
        return unidadeRepository.findOne(id);
    }
}