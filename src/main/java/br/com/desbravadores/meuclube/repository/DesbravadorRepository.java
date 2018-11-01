package br.com.desbravadores.meuclube.repository;

import br.com.desbravadores.meuclube.model.Desbravador;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DesbravadorRepository extends MongoRepository<Desbravador, String> {

}