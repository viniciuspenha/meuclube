package br.com.desbravadores.meuclube.enums;

public enum EnumCargoUnidade {
    CONSELHEIRO_ASSOCIADO("Conselheiro Associado"),
    CAPITAO("Capitão"),
    SECRETARIO("Secretário"),
    TESOUREIRO("Tesoureiro"),
    PADIOLEIRO("Padioleiro"),
    ALMOXARIFE("Almoxarife"),
    CAPELAO("Capelão");

    EnumCargoUnidade(String cargo) {
        this.cargo = cargo;
    }

    private String cargo;
}