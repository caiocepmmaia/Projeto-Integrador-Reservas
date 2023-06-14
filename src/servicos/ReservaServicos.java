/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.MesaDAO;
import dao.ReservaDAO;
import java.util.ArrayList;
import model.Mesa;
import model.Reservas;

/**
 *
 * @author Caio
 */
public class ReservaServicos {
    public void cadastroReservas (Reservas rVO){
        ReservaDAO rDAO = DAOFactory.getReservaDAO();
        rDAO.cadastrarReservaDAO(rVO);
    }
    public ArrayList<Reservas> getReservas(){
        ReservaDAO rDAO = DAOFactory.getReservaDAO();
        return rDAO.getReserva();
    }
    public Reservas getReservasByDoc (String numReserva){
        ReservaDAO rDAO = DAOFactory.getReservaDAO();
        return rDAO.getReservaByDoc(numReserva);
    }
    public void atualizarReservas(Reservas rVO){
        ReservaDAO rDAO = DAOFactory.getReservaDAO();
        rDAO.atualizarReservasDAO(rVO);
    }
    public void deletarReservas(String numReserva) {
        ReservaDAO rDAO = DAOFactory.getReservaDAO();
        rDAO.deletarReservasDAO(numReserva);
    }

}
