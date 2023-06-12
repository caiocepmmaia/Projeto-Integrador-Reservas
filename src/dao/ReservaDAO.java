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
import model.Reservas;

/**
 *
 * @author gabri
 */
public class ReservaDAO {
    public void cadastrarReservaDAO(Reservas rVO){
        try {
            Connection con = Conexao.getConexao();
            String sql = "insert into reservas values (null, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, rVO.getIdReserva());
            pst.setString(1, rVO.getHoraRes());
            pst.setString(1, rVO.getQntAssento());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar reserva.\n"
            + e.getMessage());
        }
    }
    public ArrayList<Reservas> getReserva(){
        ArrayList<Reservas> reserva = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from reservas";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Reservas r = new Reservas();
                r.setIdReserva(rs.getInt("idReserva"));
                r.setHoraRes(rs.getString("HoraRes"));
                r.setQntAssento(rs.getString("QntAssento"));
                reserva.add(r);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar reservas.\n"
            + e.getMessage());
        }
        return reserva;
    }
    public Reservas getReservaByDoc(int idReserva){
        Reservas r = new Reservas();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from reservas where idReserva = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idReserva);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                r.setIdReserva(rs.getInt("idReserva"));
                r.setHoraRes(rs.getString("HoraRes"));
                r.setQntAssento(rs.getString("QntAssento"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar reserva,\n"
                        + e.getMessage());
        }
        return r;
    }
    public void atualizarReservasDAO(Reservas rVO){
        try {
            Connection con = Conexao.getConexao();
            String sql = "update reservas set HoraRes = ?, QntAssento = ?"
                    + "where idReserva = ?";
            PreparedStatement pst =  con.prepareStatement(sql);
            pst.setInt(1, rVO.getIdReserva());
            pst.setString(2, rVO.getHoraRes());
            pst.setString(3, rVO.getQntAssento());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar a reserva.\n"
                        + e.getMessage());
        }
    }
    public void deletarReservasDAO(int idReserva){
        try {
            Connection con = Conexao.getConexao();
            String sql =  "delete from reservas where idReserva = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idReserva);
        } catch (SQLException e) {
            System.out.println("Erro ao deletar reserva do cadastro.\n"
            + e.getMessage());
        }
    }
}
