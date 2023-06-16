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


    public Mesa() {
    }

    public String getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(String numMesa) {
        this.numMesa = numMesa;
    }

    public Mesa(String numMesa, String lugares) {
        this.numMesa = numMesa;
        this.lugares = lugares;
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




    

    @Override
    public String toString() {
        return "        Mesa        \t" + "\nMesa: \t" + numMesa + "\nLugares: \t" + lugares + '.';
    }
    
    
}
