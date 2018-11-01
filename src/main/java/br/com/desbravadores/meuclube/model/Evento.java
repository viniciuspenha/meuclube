package br.com.desbravadores.meuclube.model;

import br.com.desbravadores.meuclube.enums.EnumTipoEvento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = Evento.COLLECTION_NAME)
public class Evento implements Serializable {

    public static final String COLLECTION_NAME =  "evento";

    @Id
    private String id;
    private String nome;
    private LocalDateTime data;
    private Endereco local;
    private BigDecimal valorUnitario;
    private EnumTipoEvento tipoEvento;
    private String descricao;
}