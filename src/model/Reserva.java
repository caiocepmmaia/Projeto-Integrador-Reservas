/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 181810115
 */
public class Reserva {

    private String numReserva;
    private String qntAssento;
    private String horaRes;
    private Cliente resCliente;
    private Mesa numMesa;

    public Reserva(String numReserva, String qntAssento, String horaRes, Cliente resCliente, Mesa numMesa) {
        this.numReserva = numReserva;
        this.qntAssento = qntAssento;
        this.horaRes = horaRes;
        this.resCliente = resCliente;
        this.numMesa = numMesa;
    }

    public Mesa getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(Mesa numMesa) {
        this.numMesa = numMesa;
    }



    public Cliente getResCliente() {
        return resCliente;
    }

    public void setResCliente(Cliente resCliente) {
        this.resCliente = resCliente;
    }

    

  

    public Reserva() {
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
        return "Reservas{" + "numReserva=" + numReserva + ", qntAssento=" + qntAssento + ", horaRes=" + horaRes + '}';
    }

}

