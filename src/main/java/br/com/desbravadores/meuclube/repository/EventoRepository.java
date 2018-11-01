package br.com.desbravadores.meuclube.repository;


import br.com.desbravadores.meuclube.model.Evento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventoRepository extends MongoRepository<Evento, String> {

}