/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author 182120002
 */
public class DAOFactory {

    private static ClienteDAO cDAO = new ClienteDAO();
    private static ReservaDAO rDAO = new ReservaDAO();
    private static MesaDAO mDAO = new MesaDAO();

    public static ClienteDAO getClienteDAO() {
        return cDAO;
    }

    public static ReservaDAO getReservaDAO() {
        return rDAO;
    }
    public static MesaDAO getMesaDAO() {
        return mDAO;
    }
}
