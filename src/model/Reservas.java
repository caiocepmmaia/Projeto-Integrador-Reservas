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

    private String numReserva;
    private String qntAssento;
    private String horaRes;

    public Reservas() {
    }

    public Reservas(String numReserva, String qntAssento, String horaRes) {
        this.numReserva = numReserva;
        this.qntAssento = qntAssento;
        this.horaRes = horaRes;
    }

    public String getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(String numReserva) {
        this.numReserva = numReserva;
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
        return "        Reservas        " + "\nNumero Reserva: \t" + numReserva + "\nAssentos: \t" + qntAssento + "\nHorário da Reserva: \t" + horaRes + '.';
    }

}
