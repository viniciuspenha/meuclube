package br.com.desbravadores.meuclube.model;

import br.com.desbravadores.meuclube.enums.EnumFaixaEtaria;
import br.com.desbravadores.meuclube.enums.EnumFuncao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Unidade {

    private Long id;
    private String nome;
    private EnumFuncao funcao;
    private String gritoDeGuerra;
    private EnumFaixaEtaria faixaEtaria;

}