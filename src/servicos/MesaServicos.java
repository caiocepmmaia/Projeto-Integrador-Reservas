/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.MesaDAO;
import java.util.ArrayList;
import model.Mesa;

/**
 *
 * @author Caio
 */
public class MesaServicos {

    public void cadastroMesa(Mesa mVO) {
        MesaDAO mDAO = DAOFactory.getMesaDAO();
        mDAO.cadastrarMesaDAO(mVO);
    }
    
    public ArrayList<Mesa> getMesa() {
        MesaDAO mDAO = DAOFactory.getMesaDAO();
        return mDAO.getMesa();
    }

    public Mesa getMesaByDoc(String numMesa) {
        MesaDAO mDAO = DAOFactory.getMesaDAO();
        return mDAO.getMesaByDoc(numMesa);
    }

    public void atualizarMesa(Mesa mVO) {
        MesaDAO mDAO = DAOFactory.getMesaDAO();
        mDAO.atualizarMesaDAO(mVO);
    }

    public void deletarCliente(String numMesa) {
        MesaDAO mDAO = DAOFactory.getMesaDAO();
        mDAO.deletarMesaDAO(numMesa);
    }
    
}
