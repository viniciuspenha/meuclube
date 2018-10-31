package br.com.desbravadores.meuclube.model;

import br.com.desbravadores.meuclube.enums.Uf;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private Uf uf;
    private int cep;
    private String pais;

}