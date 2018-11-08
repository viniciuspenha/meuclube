package br.com.desbravadores.meuclube.repository;

import br.com.desbravadores.meuclube.model.Unidade;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UnidadeRepository extends MongoRepository<Unidade, String> {

}