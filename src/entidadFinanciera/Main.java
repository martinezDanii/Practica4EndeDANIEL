/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args, CCuenta CCuenta) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        try {
            probarIngresar(objetoCuenta, 350, CCuenta);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        try {
            probarRetirar(objetoCuenta, 200, CCuenta);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    /**
     * 
     * @param c
     * @param cantidad
     * @param cantidadEsperada
     * @throws Exception 
     */
    public static void probarIngresar(CCuenta c, int cantidad, CCuenta cantidadEsperada) throws Exception{
        c.ingresar(cantidad);
        
    }
    
    public static void probarRetirar(CCuenta c, int cantidad, CCuenta cantidadEsperada) throws Exception{
        c.retirar(cantidad);

    }
}