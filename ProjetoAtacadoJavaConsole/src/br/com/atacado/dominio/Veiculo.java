package br.com.atacado.dominio;

import java.time.LocalDate;

public class Veiculo extends BaseTransporte {

    public int codigoFrota;
    public String placa;

    public Veiculo() {
    }

    public Veiculo(int codigo, String descricao, LocalDate dataInsert, int codigoFrota) {
        super(codigo, descricao, dataInsert);
        this.codigoFrota = codigoFrota;
    }

}
