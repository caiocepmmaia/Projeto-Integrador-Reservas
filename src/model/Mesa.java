/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 181810115
 */
public class Mesa {
    private String numMesa;
    private String lugares;
    private String disponibilidade;

    public Mesa() {
    }

    public Mesa(String numMesa, String andar, String lugares,String disponibilidade) {
        this.numMesa = numMesa;
        this.lugares = lugares;
        this.disponibilidade = disponibilidade;
    }

    public String getnumMesa() {
        return numMesa;
    }

    public void setnumMesa(String numMesa) {
        this.numMesa = numMesa;
    }


    public String getLugares() {
        return lugares;
    }

    public void setLugares(String lugares) {
        this.lugares = lugares;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    

    @Override
    public String toString() {
        return "        Mesa        \t" + "\nMesa: \t" + numMesa + "\nLugares: \t" + lugares + disponibilidade + "\nDeisponibilidade: \t" + '.';
    }
    
    
}
