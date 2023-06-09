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
import model.Reserva;
import servicos.ClienteServicos;
import servicos.MesaServicos;
import servicos.ServicosFactory;

/**
 *
 * @author gabri
 */
public class ReservaDAO {

    public void cadastrarReservaDAO(Reserva rVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "insert into reservas values (null, ?, ?, ?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, rVO.getNumReserva());
            pst.setString(2, rVO.getHoraRes());
            pst.setString(3, rVO.getQntAssento());
            pst.setString(4, rVO.getResCliente().getCpf());
            pst.setString(5, rVO.getNumMesa().getNumMesa());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar reserva.\n"
                    + e.getMessage());
        }
    }

    public ArrayList<Reserva> getReserva() {
        ArrayList<Reserva> reserva = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from reservas";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Reserva r = new Reserva();
                r.setNumReserva(rs.getString("Numera da Reserva"));
                r.setHoraRes(rs.getString("HoraRes"));
                r.setQntAssento(rs.getString("QntAssento"));
                ClienteServicos clienteS = ServicosFactory.getClienteServicos();
                r.setResCliente(clienteS.getClienteByDoc(rs.getString("cpf")));
                MesaServicos mesaS = ServicosFactory.getMesaServicos();
                r.setNumMesa(mesaS.getMesaByDoc(rs.getString("numMesa")));
                reserva.add(r);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar reservas.\n"
                    + e.getMessage());
        }
        return reserva;
    }

    public Reserva getReservaByDoc(String numReserva) {
        Reserva r = new Reserva();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from reservas where numReserva = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, numReserva);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                r.setNumReserva(rs.getString("Numero da Reserva"));
                r.setHoraRes(rs.getString("HoraRes"));
                r.setQntAssento(rs.getString("QntAssento"));
                ClienteServicos clienteS = ServicosFactory.getClienteServicos();
                r.setResCliente(clienteS.getClienteByDoc(rs.getString("ResCliente")));
                MesaServicos mesaS = ServicosFactory.getMesaServicos();
                r.setNumMesa(mesaS.getMesaByDoc(rs.getString("numMesa")));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar reserva,\n"
                    + e.getMessage());
        }
        return r;
    }

    public void atualizarReservasDAO(Reserva rVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update reservas set HoraRes = ?, QntAssento = ?, ResCliente = ?, NumMesa = ?"
                    + "where numReserva = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(5, rVO.getNumReserva());
            pst.setString(1, rVO.getHoraRes());
            pst.setString(2, rVO.getQntAssento());
            ClienteServicos clienteS = ServicosFactory.getClienteServicos();
            pst.setString(3,clienteS.getClienteByDoc(rVO.getResCliente().getCpf()).getNome());
            MesaServicos mesaS = ServicosFactory.getMesaServicos();
            pst.setString(4, mesaS.getMesaByDoc(rVO.getNumMesa().getnumMesa()).getnumMesa());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar a reserva.\n"
                    + e.getMessage());
        }
    }

    public void deletarReservasDAO(String numReserva) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from reservas where numReserva = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, numReserva);
        } catch (SQLException e) {
            System.out.println("Erro ao deletar reserva do cadastro.\n"
                    + e.getMessage());
        }
    }
}
