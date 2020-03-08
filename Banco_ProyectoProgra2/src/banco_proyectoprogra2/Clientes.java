/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_proyectoprogra2;

/**
 *
 * @author Mvrivera
 */
public class Clientes {
    private String usuario,tipo;
    private String n_cuenta;
    private double dineroAcutal;

    public Clientes() {
    }

    
    public Clientes(String usuario, String n_cuenta,String tipo,  double dineroAcutal) {
        this.usuario = usuario;
        this.tipo = tipo;
        this.n_cuenta = n_cuenta;
        this.dineroAcutal = dineroAcutal;
    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public double getDineroAcutal() {
        return dineroAcutal;
    }

    public void setDineroAcutal(double dineroAcutal) {
        this.dineroAcutal = dineroAcutal;
    }

    @Override
    public String toString() {
        return "Clientes{" + "usuario=" + usuario + ", tipo=" + tipo + ", n_cuenta=" + n_cuenta + ", dineroAcutal=" + dineroAcutal + '}';
    }
    
    
    
}
