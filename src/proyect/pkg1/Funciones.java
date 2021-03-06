/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author giubo
 */
public class Funciones {
public Funciones(){
        
}
    
   /**
     * Procedimiento writeTxt
     * Este procedimiento guarda los datos de las listas actuales en el txt
     * @author Frank,Giulianna
     * @param vertex
     * @param 
     */   
       
    
    public void writeTxt(VertexList vertex, WeightList listsimp){
        String txt = "";
        String txt2 ="";
        
        if(!vertex.IsEmpty()){
            Vertex temp= vertex.getpFirst();
            
            for(int i = 0;i< vertex.getSize()-1;i++){
                txt +="Almacen "+ temp.getName() + ":"+"\n";
                ProductsList lispro=temp.getListaver();
                ProductsNode mynod= lispro.getPrimer_producto();
                for(int j = 0;j< lispro.getSize()-1;j++){
                    txt += mynod.getNombre() +","+mynod.getCantidad()+"\n";
                    mynod = mynod.getProximo();
                }
                txt +=mynod.getNombre() +","+mynod.getCantidad()+";"+"\n";
                temp =temp.getSiguiente();
            }  
        }
        
        if(!listsimp.IsEmpty()){
            WeightNode temp1= listsimp.getpFirst();
            for(int z =0;z< listsimp.getSize()-1;z++){
                txt2 +=temp1.getVertex1()+","+temp1.getVertex2()+","+temp1.getWeight()+"\n";
                temp1 =temp1.getpNext();
            }  
        }
        
        try{
            PrintWriter pw = new PrintWriter("test//lista.txt");
            pw.print("Almacenes; Esta Linea se salta automaticamente"+"\n");
            pw.append(txt);
            pw.print("Rutas;"+"\n");
            pw.append(txt2);
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado Exitoso.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Fallo En Cargar Datos.");
        }

    } 
    
     /**
     * Funcion Leer_txt
     * Esta funcion devuelve la lista de los pesos
     * @author Frank,Giulianna
     * @return WeightList
     * @param path
     * @param listaVer 
     */
    
    
    public WeightList Leer_txt(String path,VertexList listaVer){
        WeightList lista = new WeightList();
        String line;
        String info = "";
        File file = new File(path);
        
        try{
            if (!file.exists()) {
                file.createNewFile();
            }   
            else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                br.readLine();
                while((line = br.readLine())!=null ){
                    if (line.endsWith("Rutas;")){
                        while((line = br.readLine())!=null ){
                            if (!line.isEmpty()) {
                                info += line +"\n";
                            }
                        }
                        break;
                    }
                }     
                if (!"".equals(info)){
                    String[] infos = info.split("\n");
                    for(int i = 0;i< infos.length;i++){
                        String[] infod = infos[i].split(",");
                        
                        WeightNode mynod = new WeightNode(infod[0],infod[1],Integer.parseInt(infod[2]));
                        lista.addAtEnd(mynod);
                        
                    }
                }
                
                br.close();
            } 
        }
                
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "??RROR AL LEER! ");
        }
        
        return lista;
    }
    
     /**
     * Funcion Leer_matrix
     * Esta funcion solo devuelve la lista de los vertices
     * @author Frank,Giulianna
     * @param path
     * @return VertexList la lista de los vertices
     */
    
    public VertexList Leer_matrix(String path){
        VertexList lista = new VertexList();
        String line;
        String infotd = "";
        
        File file = new File(path);
        
        try{
            if (!file.exists()) {
                file.createNewFile();
                JOptionPane.showMessageDialog(null,"Por favor introduzca al menos un Almacen con art??culos al inicializar","No existe archivo",JOptionPane.WARNING_MESSAGE);
            }   
            else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                br.readLine();
                while((line = br.readLine())!=null && !line.endsWith("Rutas;")){
                    
                    infotd += line.replaceAll("Almacen ","") +"\n";         
                }
                
                if(!"".equals(infotd)){
                    String[] infos = infotd.split(";");
                    for(int i = 0;i< infos.length -1;i++){
                        String newel = infos[i];
                        String[]newell = newel.split(":");
                        String miAlmacen = newell[0].replaceAll("\n","");
                        newell[1] = newell[1].stripLeading();
                        String otros = newell[1].replace("\n",",");
                        String[] low = otros.split(",");
                        ProductsList listprod =new ProductsList();
                        
                        
                        for(int j = 0;j< low.length-1;j++){
                            int k=j;
                            int m =j+1;
                            ProductsNode nod =new ProductsNode(low[k],Integer.parseInt(low[m]));
                            j=j+1;
                            listprod.AddAtEnd(nod);
                        }
                        Vertex vers =new Vertex(miAlmacen,listprod);
                        lista.AddAtEnd(vers);
                    }
                }
                br.close();
                
            } 
        }
                
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR AL LEER! ");
        }
        return lista; 
    }
    
    
}
    
    
    
    

    
