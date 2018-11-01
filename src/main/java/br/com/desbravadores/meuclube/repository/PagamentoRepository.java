package br.com.desbravadores.meuclube.repository;

import br.com.desbravadores.meuclube.model.Pagamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PagamentoRepository extends MongoRepository<Pagamento, String> {

}