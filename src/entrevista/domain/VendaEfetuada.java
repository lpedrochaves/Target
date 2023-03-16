/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrevista.domain;

/**
 *
 * @author pedro
 */
public class VendaEfetuada {

    //Manter o nome do atributo igual ao nome do arquivo Json
    Integer dia;
    Double valor;

    public VendaEfetuada() {

    }

    public VendaEfetuada(Integer dia, Double valor) {
        super();
        this.dia = dia;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "VendaEfetuada [dia=" + dia + ", valor=" + valor + "]";
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
