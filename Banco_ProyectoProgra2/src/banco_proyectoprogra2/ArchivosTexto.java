/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_proyectoprogra2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mvrivera
 */
public class ArchivosTexto {
     private Scanner sc = new Scanner(System.in);
    private String texto;
    private File archivo;
    private ArrayList<Clientes> lista;

    public ArchivosTexto() {
    }

    public ArchivosTexto(String texto, ArrayList<Clientes> lista) {
        archivo = new File(texto);
        this.lista = lista;
    }
     public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Clientes> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Clientes> lista) {
        this.lista = lista;
    }
    public void setCliente(Clientes c){
        lista.add((Clientes)c);
    }
     public void Escribir() throws Exception {
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Clientes p : lista) {
                String prueba = p.getUsuario()+ "," + p.getN_cuenta()+ "," + p.getTipo()+ "," + p.getDineroAcutal()+";\n";
                bw.append(prueba);
        }
        bw.flush();
        bw.close();
        fw.close();
    }

    public void Leer() {
        Scanner sc = null;
        lista=new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
            } catch (FileNotFoundException ex) {
            }
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                String p = sc.next();
                String [] tokens =p.split(",");
                if (tokens.length >=4) {
                    Clientes u = new Clientes(tokens[0],Integer.parseInt(tokens[1]),tokens[2],Double.parseDouble(tokens[3]));
                    lista.add(u);
                }
            }
        }
    }
    
    
}
