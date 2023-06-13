/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author 181810115
 */
public class ClienteDAO {

    public void cadastrarClienteDAO(Cliente cVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "insert into clientes values (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNome());
            pst.setString(2, cVO.getCpf());
            pst.setString(3, cVO.getTelefone());
            pst.setString(4, cVO.getEndereco());
            pst.setString(5, cVO.getPagForma());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar cliente.\n"
                    + e.getMessage());

        }
    }

    public ArrayList<Cliente> getClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from clientes ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setCpf(rs.getString("cpf"));
                c.setEndereco(rs.getString("endereco"));
                c.setNome(rs.getString("nome"));
                c.setPagForma(rs.getString("pagforma"));
                c.setTelefone(rs.getString("telefone"));
                clientes.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar clientes.\n"
                    + e.getMessage());
        }
        return clientes;
    }

    public Cliente getClienteByDoc(String cpf) {
        Cliente c = new Cliente();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from clientes wherw cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                c.setIdCliente(rs.getInt("idCliente"));
                c.setCpf(rs.getString("cpf"));
                c.setEndereco(rs.getString("endereco"));
                c.setNome(rs.getString("nome"));
                c.setPagForma(rs.getString("pagforma"));
                c.setTelefone(rs.getString("telefone"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar CPF./n" + e.getMessage());
        }
        return c;
    }

    public void atualizarClienteDAO(Cliente cVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update clientes set nome = ?, endereco = ?, telefone = ?"
                          + "where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getCpf());
            pst.setString(2, cVO.getEndereco());
            pst.setString(3, cVO.getNome());
            pst.setString(4, cVO.getPagForma());
            pst.setString(5, cVO.getTelefone());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Cliente.\n"
                    + e.getMessage());
        }
    }
    public void deletarClienteDAO(String cpf){
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from clientes where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar Cliente do cadastro.\n"
                    + e.getMessage());
        }
        
    }

}
