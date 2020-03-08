/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_proyectoprogra2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mvrivera
 */
public class Bancos extends ConexionSockets {

    ArrayList<String> clientes = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    public Bancos() throws IOException {
        super("servidor");
    }

    public void startServer() {
        try {
            System.out.println("Esperando...");
            cs = ss.accept();
            System.out.println("Cliente en línea");
            salidaCliente = new DataOutputStream(cs.getOutputStream());
            salidaCliente.writeUTF("Petición recibida y aceptada");
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            while ((mensajeServidor = entrada.readLine()) != null) {
                String h = mensajeServidor;
                BANCO b = new BANCO();
                b.textoaqui(mensajeServidor);
                System.out.println("a " + h);
            }
           
            if (true){
            System.out.println("Fin de la conexión");
            ss.close();    
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
