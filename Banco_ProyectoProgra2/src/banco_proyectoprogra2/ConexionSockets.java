/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_proyectoprogra2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Mvrivera
 */
public class ConexionSockets {
     private final int PUERTO = 1234; 
    private final String HOST = "localhost"; 
    protected String mensajeServidor; 
    protected ServerSocket ss; 
    protected Socket cs; 
    protected DataOutputStream salidaServidor, salidaCliente; 
    protected DataInputStream entradaServidor, entradaCliente; 

    public ConexionSockets(String tipo) throws IOException 
    {
        if (tipo.equalsIgnoreCase("servidor")) {
            ss = new ServerSocket(PUERTO);
            cs = new Socket(); 
        } else {
            cs = new Socket(HOST, 1234);
        }
        
    }

}
