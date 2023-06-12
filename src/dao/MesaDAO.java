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
           String sql = "insert into mesas values (null, ?,?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, mVO.getDisponibilidade());
           pst.setInt(2, mVO.getLugares());
           pst.setInt(3, mVO.getnumMesa());
           pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar cliente.\n"
                            + e.getMessage());
        }
    }
    public ArrayList<Mesa> getMesas(){
        ArrayList<Mesa> mesas = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from mesas";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Mesa m = new Mesa();
                m.setnumMesa(rs.getInt("numMesa"));
                m.setDisponibilidade(rs.getString("disponibilidade"));
                m.setLugares(rs.getInt("lugares"));
                mesas.add(m);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar mesas\n"
                        +e.getMessage());
        }
        return mesas;
    }
    public Mesa getMesaByDoc(int numMesa){
        Mesa m = new Mesa();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from mesas where numMesa = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, numMesa);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                m.setnumMesa(rs.getInt("numMesa"));
                m.setDisponibilidade(rs.getString("disponibilidade"));
                m.setLugares(rs.getInt("lugares"));
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
            String sql = "update mesas set disponibilidade = ?,lugares = ?"
                    + "where numMesa = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, mVO.getDisponibilidade());
            pst.setInt(2, mVO.getLugares());
            pst.setInt(3, mVO.getnumMesa());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Mesa.\n"
            + e.getMessage());
        }
    }
    public void deletarMesaDAO(int numMesa){
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from mesas where numMesa = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, numMesa);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar mesa do cadastro.\n"
            + e.getMessage());
        }
    }
}

