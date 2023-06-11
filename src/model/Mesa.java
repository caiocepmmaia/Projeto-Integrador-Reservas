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
    private int idMesa;
    private String andar;
    private int lugares;
    private String disponibilidade;

    public Mesa() {
    }

    public Mesa(int idMesa, String andar, int lugares,String disponibilidade) {
        this.idMesa = idMesa;
        this.lugares = lugares;
        this.disponibilidade = disponibilidade;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }


    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
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
        return "        Mesa        \t" + "\nMesa: \t" + idMesa + "\nLugares: \t" + lugares + disponibilidade + "\nDeisponibilidade: \t" + '.';
    }
    
    
}
