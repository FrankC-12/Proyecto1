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
        String rutas_finales[][];
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
                            p++;

                        }
                    }
                }

                if ((!"".equals(almacenes_txt)) && (!"".equals(rutas_txt))) {
                    String[] split1 = almacenes_txt.split(";");
                    String[] routesSplit = rutas_txt.split("\n");
                    Lista_Stock Lista = new Lista_Stock();
                    rutas_finales = new String[p-1][3];

                    try {

                        for (int j = 0; j < routesSplit.length; j++) {
                            if (j == 0) {
                                continue;
                            } else {
                                String[] routesSplit2 = routesSplit[j].split(",");
                                rutas_finales[j - 1] = routesSplit2;
                            }
                        }

                        for (int i = 1; i < split1.length; i++) {
                            String[] split2 = split1[i].split("\n");
                            Nodo nodito = new Nodo();
                            nodito.productos = new String[split2.length - 2][2];

                            for (int j = 1; j < split2.length; j++) {
                                if (j == 1) {
                                    nodito.setNombre_Almacen(split2[j]);
                                    Lista.FinalInsertNodo(nodito);

                                } else if (j > 1) {
                                    String aux1 = split2[j];
                                    String split3[] = aux1.split(",");
                                    nodito.productos[j - 2] = split3;
                                }
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("j");
                    }

                    for (String[] x : rutas_finales) {

                        for (String y : x) {
                            System.out.print(y);
                        }
                    }
                    Nodo aux = Lista.getpFirst();
                    for (int i = 0; i < Lista.getSize(); i++) {
                        System.out.println(aux.getNombre_Almacen());
                        for (String[] x : aux.getProductos()) {
                            System.out.println(x[0]);
                            System.out.println(x[1]);
                        }
                        aux = aux.getPnext();
                    }
                }
                br.close();
            }
        } catch (IOException ex) {
            System.out.println("error al leer el txt");
        }

    }
}
