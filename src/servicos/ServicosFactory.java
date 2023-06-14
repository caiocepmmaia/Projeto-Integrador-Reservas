/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

/**
 *
 * @author 201401665
 */
public class ServicosFactory {
    private static ClienteServicos clienteS = new ClienteServicos();
    private static MesaServicos mesaS = new MesaServicos();
    private static ReservaServicos reservaS = new ReservaServicos();
    
    public static ClienteServicos getClienteServicos(){
        return clienteS;
    }
    public static MesaServicos getMesaServicos() {
        return mesaS;
    }
    public static ReservaServicos getReservaServicos() {
        return reservaS;
    }
}
