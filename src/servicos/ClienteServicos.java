/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.ClienteDAO;
import dao.DAOFactory;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author 201401665
 */
public class ClienteServicos {
    public void cadastroCliente (Cliente cVO){
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.cadastrarClienteDAO(cVO);
    }
    
    public ArrayList<Cliente> getClientes(){
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.getClientes();
    }
    
    public Cliente getClienteByDoc(String cpf){
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.getClienteByDoc(cpf);
    }
    
    public void atualizarPessoa(Cliente cVO){
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.atualizarClienteDAO(cVO);
    }
    
    public void deletarCliente (String cpf){
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.deletarClienteDAO(cpf);
    }
}
