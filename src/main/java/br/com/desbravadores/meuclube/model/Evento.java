package br.com.desbravadores.meuclube.model;

import br.com.desbravadores.meuclube.enums.EnumTipoEvento;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = Evento.COLLECTION_NAME)
public class Evento implements Serializable {

    public static final String COLLECTION_NAME =  "evento";

    @Id
    private String id;
    private String nome;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime data;
    private Endereco local;
    private BigDecimal valorUnitario;
    private EnumTipoEvento tipoEvento;
    private String descricao;

}