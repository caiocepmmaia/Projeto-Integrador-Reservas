/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 181810115
 */
public class Cliente {

    private int idCliente;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    public Cliente() {
    }

    public Cliente(int idCliente, String nome, String cpf, String endereco, String telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "        Cliente     " + "\nidCliente: \t" + idCliente + "\nNome: \t" + nome + "\nCPF: \t" + cpf
                + "\nEndereço: \t" + endereco + "\nTelefone: \t" + telefone + '.';
    }

}// FIM OBJETO CLIENTES!
