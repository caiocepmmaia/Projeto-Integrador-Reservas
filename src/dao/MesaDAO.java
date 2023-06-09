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
import model.Mesa;

/**
 *
 * @author gabri
 */
public class MesaDAO {
    public void cadastrarMesaDAO(Mesa mVO){
        try {
           Connection con = Conexao.getConexao();
           String sql = "insert into mesa values (?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, mVO.getnumMesa());
           pst.setString(2, mVO.getLugares());
           pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar cliente.\n"
                            + e.getMessage());
        }
    }
    public ArrayList<Mesa> getMesa(){
        ArrayList<Mesa> mesa = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from mesa";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Mesa m = new Mesa();
                m.setnumMesa(rs.getString("numMesa"));
                m.setLugares(rs.getString("lugares"));
                mesa.add(m);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar mesa\n"
                        +e.getMessage());
        }
        return mesa;
    }
    public Mesa getMesaByDoc(String numMesa){
        Mesa m = new Mesa();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from mesa where numMesa = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, numMesa);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                m.setLugares(rs.getString("lugares"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar numero Mesa.\n"
                            +e.getMessage());
        }
        return m;
    }
    public void atualizarMesaDAO(Mesa mVO){
        try {
            Connection con = Conexao.getConexao();
            String sql = "update mesa set lugares = ?"
                    + "where numMesa = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(2, mVO.getnumMesa());
            pst.setString(1, mVO.getLugares());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Mesa.\n"
            + e.getMessage());
        }
    }
    public void deletarMesaDAO(String numMesa){
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from mesa where numMesa = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, numMesa);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar mesa do cadastro.\n"
            + e.getMessage());
        }
    }
}

