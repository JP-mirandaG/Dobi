package com.senai.infoa.dobi.enums;

public enum TipoConta {
    
    PESSOAL(1, "Pessoal"),
    ACADEMICO(2, "Acadêmico"),
    INSTITUCIONAL(3, "Institucional");

    private int id;

    TipoConta(int id, String descricao) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
