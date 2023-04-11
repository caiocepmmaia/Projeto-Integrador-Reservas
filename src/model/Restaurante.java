/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalTime;

/**
 *
 * @author 181810115
 */
public class Restaurante {
    private int idRestaurante;
    private String cnpj;
    private String nome;
    private LocalTime horaAbre; 
    private LocalTime horaFecha;
    private int qntMesa;

    public Restaurante() {
    }

    public Restaurante(int idRestaurante, String cnpj, String nome, LocalTime horaAbre, LocalTime horaFecha, int qntMesa) {
        this.idRestaurante = idRestaurante;
        this.cnpj = cnpj;
        this.nome = nome;
        this.horaAbre = horaAbre;
        this.horaFecha = horaFecha;
        this.qntMesa = qntMesa;
    }

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getHoraAbre() {
        return horaAbre;
    }

    public void setHoraAbre(LocalTime horaAbre) {
        this.horaAbre = horaAbre;
    }

    public LocalTime getHoraFecha() {
        return horaFecha;
    }

    public void setHoraFecha(LocalTime horaFecha) {
        this.horaFecha = horaFecha;
    }

    public int getQntMesa() {
        return qntMesa;
    }

    public void setQntMesa(int qntMesa) {
        this.qntMesa = qntMesa;
    }

    @Override
    public String toString() {
        return "        Restaurante         \t" + "\nidRestaurante: \t" + idRestaurante + "\nCNPJ: \t" + cnpj + "\nNome: \t" + nome 
                + "\nAbertura: \t" + horaAbre + "\nFechamento: \t" + horaFecha + "\nQuantidade de Mesas: \t" + qntMesa + '.';
    }
    
    
}// Fim Objeto RESTAURANTE
