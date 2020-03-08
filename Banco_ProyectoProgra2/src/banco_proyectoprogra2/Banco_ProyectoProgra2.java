/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_proyectoprogra2;

import java.io.IOException;

/**
 *
 * @author Mvrivera
 */
public class Banco_ProyectoProgra2 
{
    public static void main(String[] args)throws IOException {
         Bancos serv = new Bancos();
        System.out.println("Iniciando servidor\n");
        serv.startServer(); 
         
    }
    
}
