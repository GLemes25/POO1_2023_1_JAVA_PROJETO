package br.com.atacado.dominio;

import java.time.LocalDate;

public class Frota extends BaseTransporte {

    public Frota() {
    }

    public Frota(int codigo, String descricao, LocalDate dataaInsert) {
        super(codigo, descricao, dataaInsert);
    }

}
