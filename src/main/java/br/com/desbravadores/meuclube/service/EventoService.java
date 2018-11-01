package br.com.desbravadores.meuclube.service;

import br.com.desbravadores.meuclube.model.Evento;
import br.com.desbravadores.meuclube.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public void salvar(Evento evento) {
        eventoRepository.save(evento);
    }

    public Evento buscar(String id) {
        return eventoRepository.findOne(id);
    }

    public void deletar(String id) {
        eventoRepository.delete(id);
    }
}