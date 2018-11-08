package br.com.desbravadores.meuclube.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = Unidade.COLLECTION_NAME)
public class Unidade implements Serializable {

    public static final String COLLECTION_NAME =  "unidade";

    @Id
    private String id;
    private String nome;
    private LocalDate fundacao;
    private Integer idadeMinima;
    private Integer idadeMaxima;
    private String gritoDeGuerra;

}