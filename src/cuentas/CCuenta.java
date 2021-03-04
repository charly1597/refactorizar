package cuentas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author EntornosDesarrollo
 * visto
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
     * @return the nombre
     */

    
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    

    public CCuenta() {
    }

    public CCuenta(String nombre, String cuenta, double saldo, double tipo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }
    
    public double estado(){
        return getSaldo();
    }
    
    public void ingresar(double cantidad) throws Exception{
        if(cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
            setSaldo(getSaldo() + cantidad);
        
    }
    public void retirar(double cantidad) throws Exception{
        if(cantidad<=0){
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if(estado()<cantidad)
            throw new Exception("No hay suficiente saldo");
            setSaldo(getSaldo() - cantidad);
        
    }
}
