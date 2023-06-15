/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.DAOFactory;
import dao.ReservaDAO;
import java.util.ArrayList;
import model.Reserva;

/**
 *
 * @author 181810115
 */
public class ReservaServicos {
        public void cadastroReservas (Reserva rVO){
        ReservaDAO rDAO = DAOFactory.getReservaDAO();
        rDAO.cadastrarReservaDAO(rVO);
    }
        public ArrayList<Reserva> getReserva(){
            ReservaDAO rDAO = DAOFactory.getReservaDAO();
            return rDAO.getReserva();
        }
    public Reserva getReservaByDoc (String numReserva){
        ReservaDAO rDAO = DAOFactory.getReservaDAO();
        return rDAO.getReservaByDoc(numReserva);
    }
        
    public void atualizarReservas(Reserva rVO){
        ReservaDAO rDAO = DAOFactory.getReservaDAO();
        rDAO.atualizarReservasDAO(rVO);
    }
    public void deletarReservas(String numReserva) {
        ReservaDAO rDAO = DAOFactory.getReservaDAO();
        rDAO.deletarReservasDAO(numReserva);
    }

}


