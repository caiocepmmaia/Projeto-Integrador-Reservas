/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;

/**
 *
 * @author 181810115
 */
public class ClienteDAO {
    
    public void cadastrarClienteDAO(Cliente cVO){
        try {
            Connection con = Conexao.getConexao();
            String sql = "insert into clientes values (null,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getCpf());
            pst.setString(2, cVO.getEndereco());
            pst.setString(3, cVO.getNome());
            pst.setString(4, cVO.getPagForma());
            pst.setString(5, cVO.getTelefone());
            pst.executeUpdate();
        }catch (SQLException e){
            System.out.println("Erro ao cadastrar cliente.\n"
            + e.getMessage());
            
        }
    }
    
}
