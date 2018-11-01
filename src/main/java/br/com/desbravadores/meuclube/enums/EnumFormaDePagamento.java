package br.com.desbravadores.meuclube.enums;

public enum EnumFormaDePagamento {

    DINHEIRO("Dinheiro"),
    CARTAO("Cartão");

    private String descricao;

    EnumFormaDePagamento(String descricao) {
        this.descricao = descricao;
    }
}