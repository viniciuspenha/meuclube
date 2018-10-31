package br.com.desbravadores.meuclube.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = Desbravador.COLLECTION_NAME)
public class Desbravador implements Serializable {

    public static final String COLLECTION_NAME =  "desbravador";

    @Id
    private String id;
    private String nome;
    private int idade;
    private Unidade unidade;
    private String rg;
    private String cpf;
    private String email;
    private Endereco endereco;
    private String nomePai;
    private String telefonePai;
    private String emailPai;
    private String nomeMae;
    private String telefoneMae;
    private String emailMae;
    private String nomeResponsavel;

}