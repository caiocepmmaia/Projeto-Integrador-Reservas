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

    public Mesa() {
    }

    public Mesa(int idMesa, String andar, int lugares) {
        this.idMesa = idMesa;
        this.andar = andar;
        this.lugares = lugares;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    @Override
    public String toString() {
        return "        Mesa        \t" + "\nMesa: \t" + idMesa + "\nAndar: \t" + andar + "\nLugares: \t" + lugares + '.';
    }
    
    
}
