/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author giubo
 */
public class Funciones {

    public String almacenes[][];
    public String rutas[][];
    boolean warehouses;

    public Funciones() {
        this.almacenes = almacenes;
        this.rutas = rutas;
        this.warehouses = warehouses;
    }

    public void Leertxt() {
        int p = 0;
        int l = 0;
        String line;
        String almacenes_txt = "";
        String rutas_txt = "";

        try {
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(null);
            File abre = file.getSelectedFile();

            if (abre != null) {
                FileReader archivos = new FileReader(abre);
                BufferedReader br = new BufferedReader(archivos);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        if ("Almacenes;".equals(line)) {
                            warehouses = true;

                        } else if ("Rutas;".equals(line)) {
                            warehouses = false;
                            System.out.println("hola");
                        }

                        if (warehouses == true) {
                            almacenes_txt += line + "\n";

                        } else {
                            rutas_txt += line + "\n";

                        }
                    }
                }

                if ((!"".equals(almacenes_txt)) && (!"".equals(rutas_txt))) {
                    String[] AlmacenesSplit1 = almacenes_txt.split(";");
                    String[] RoutesSplit = rutas_txt.split("/n");

                    p = AlmacenesSplit1.length;
                    l = RoutesSplit.length;
                    almacenes = new String[p][2];
                    rutas = new String[l][2];

                    for (int i = 0; i < AlmacenesSplit1.length; i++) {
                        String[] AlmacenesSplit2 = AlmacenesSplit1[i].split(":");
                        String [] AlmacenesSplit3= AlmacenesSplit2[i].split("/n");
                          for (int j = 0; j < AlmacenesSplit3.length; j++) {
                              String [] AlmacenesSplit4= AlmacenesSplit3[i+1].split(",");
                              AlmacenesSplit3[i] = AlmacenesSplit4;
                               
                              
                              
                              
                        
                        
                    }
                        
                    }
                  
                    

                
                for (int j = 0; j < RoutesSplit.length; j++) {
                    String[] RoutesSplit2 = RoutesSplit[j].split(",");
                    rutas[j] = RoutesSplit2;

                }

            }
            br.close();
        }
    }
    catch (IOException ex

    
        ) {
            System.out.println("error al leer el txt");
    }

}
}
