package br.com.desbravadores.meuclube.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Unidade {

    private Long id;
    private String nome;
    private LocalDate fundacao;
    private Integer idadeMinima;
    private Integer idadeMaxima;
    private String gritoDeGuerra;

}