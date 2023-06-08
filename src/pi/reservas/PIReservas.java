/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pi.reservas;

import controller.CCliente;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 181810115
 */
public class PIReservas {
    public static CCliente cadCarro = new CCliente();
    static Scanner leia = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int leiaNumInt(){
        Scanner leiaNum = new Scanner(System.in);
        try {
            return leaiNum.nextInt();
        } catch (InputMismatchException i){
            System.out.println("Erro" + i.getMessage() + "\nTente novamente!");
            leiaNumInt();
        }
        return 99;
    }
 
    public static void MenuC(){
        System.out.println("-- MENU RESERVAS --");
        System.out.println("1 - Gerenciar Clientes");
        System.out.println("2 - Gerenciar Mesas");
        System.out.println("0 - Sair");
        System.out.print("Digite Aqui: ");
        
    }
}
