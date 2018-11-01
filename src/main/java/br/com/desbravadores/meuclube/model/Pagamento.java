package br.com.desbravadores.meuclube.model;

import br.com.desbravadores.meuclube.enums.EnumFormaDePagamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = Pagamento.COLLECTION_NAME)
public class Pagamento implements Serializable {

    public static final String COLLECTION_NAME =  "pagamento";

    @Id
    private String id;
    private Desbravador desbravador;
    private LocalDate data;
    private BigDecimal valorPago;
    private EnumFormaDePagamento formaDePagamento;
    private Evento evento;
    private String descricao;
}