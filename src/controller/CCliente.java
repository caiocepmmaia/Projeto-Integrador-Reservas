/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author 181810115
 */
public class CCliente {

    ArrayList<Cliente> cliente = new ArrayList();
    int idCliente = 1;

    public int geraID() {
        return this.idCliente++;
    }

    public void addCliente(Cliente c) {
        this.cliente.add(c);
    }//fim addCliente

    public void removeCliente(Cliente c) {
        this.cliente.remove(c);
    }// fim remove

    public ArrayList<Cliente> getCliente() {
        return this.cliente;
    }

    public Cliente getClieteCPF(String CPF) {
        Cliente c = null;
        for (Cliente cli : cliente) {
            if (cli.getCpf().equals(CPF)) {
                c = cli;
                break;
            }//fim if
        }//fim for
        return c;
    }// fim getclienteCPF
    
    public void mockClientes(){
        Cliente c1 = new Cliente();
        c1.setIdCliente(geraID());
        c1.setCpf("55857188008");
        c1.setNome("Fernando Lucio da Costa");
        c1.setEndereco("Av. Nonoai");
        c1.setTelefone("51 9 3214-5896");
        addCliente(c1);
                Cliente c2 = new Cliente();
        c2.setIdCliente(geraID());
        c2.setCpf("48944488070");
        c2.setNome("Gabrielzito do CS");
        c2.setEndereco("Padre Cacique");
        c2.setTelefone("51 9 1234-1234");
        addCliente(c2);
    }//fim do mock

}//Fim Array List CLIENTES!
