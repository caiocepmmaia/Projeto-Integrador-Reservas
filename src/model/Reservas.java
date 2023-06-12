/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author 181810115
 */
public class Reservas {
    private int idReserva;
    private String qntAssento;
    private String horaRes;

    public Reservas() {
    }

    public Reservas(int idReserva, String qntAssento, String horaRes) {
        this.idReserva = idReserva;
        this.qntAssento = qntAssento;
        this.horaRes = horaRes;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getQntAssento() {
        return qntAssento;
    }

    public void setQntAssento(String qntAssento) {
        this.qntAssento = qntAssento;
    }

    public String getHoraRes() {
        return horaRes;
    }

    public void setHoraRes(String horaRes) {
        this.horaRes = horaRes;
    }

    @Override
    public String toString() {
        return "        Reservas        " + "\nIdReserva: \t" + idReserva + "\nAssentos: \t" + qntAssento + "\nHorário da Reserva: \t" + horaRes + '.';
    }
    
    
}
