package cuentas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Carlos Talavera
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operativa_cuenta(1000);
    }

    /**
     * @param cantidad En este caso el parámetro no se usa para nada
     */
    public static void operativa_cuenta(float cantidad) {
        // TODO code application logic here
        CCuenta cuenta1;
        double saldoActual;
        
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        
        try{
            cuenta1.retirar(2300);
        } catch (Exception e){
            System.out.println("Fallo al retirar");
        }
        try{
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e){
            System.out.println("Fallo al retirar");
        }
        
        try{
            cuenta1.ingresar(300);
        }catch(Exception e){
            System.out.println("Fallo al ingresar");
        }
    }
    
}
