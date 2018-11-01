package br.com.desbravadores.meuclube.service;

import br.com.desbravadores.meuclube.model.Desbravador;
import br.com.desbravadores.meuclube.repository.DesbravadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesbravadorService {

    @Autowired
    private DesbravadorRepository desbravadorRepository;

    public void salvar(Desbravador desbravador) {
        desbravadorRepository.save(desbravador);
    }

    public void deletar(String id) {
        desbravadorRepository.delete(id);
    }

    public Desbravador buscar(String id) {
        return desbravadorRepository.findOne(id);
    }
}