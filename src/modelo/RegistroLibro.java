/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aaron
 */
public class RegistroLibro {

    private ArrayList<Libro> listaLibros;

    public RegistroLibro() {
        listaLibros = new ArrayList<Libro>();
    }

    public String addBook(Libro libro) {
        if (libro != null) {
            if (verificarID(libro.getiD())) {
                listaLibros.add(libro);
                return "El libro se registró correctamente";
            } else {
                return "El libro ya se encuentra registrado!";
            }
        } else {
            return "El objeto es null!";
        }
    }

    public boolean verificarID(String iD) {
        if (!iD.equalsIgnoreCase("")) {
            if (listaLibros.size() != 0) {
                for (Libro libroE : listaLibros) {
                    if (libroE.getiD().equalsIgnoreCase(iD)) {
                        return false;
                    }
                }
            }
        }
        return true;

    }

    public Libro buscarLibro(String ID) {
        if (!ID.equalsIgnoreCase("")) {
            for (Libro libroE : listaLibros) {
                if (libroE.getiD().equalsIgnoreCase(ID)) {
                    return libroE;
                }
            }
        }
        return null;
    }
    
    public String eliminarLibro(String ID){
        Libro libroE=buscarLibro(ID);
        if(libroE!=null){
             listaLibros.remove(libroE);
             return "El libro se eliminó correctamente.";
        }
        return "El libro no se encuentra registrado.";   
    }
    
    public String consultarLibros(){
        String salida="";
        for (Libro libros : listaLibros) {
            salida+=libros+"\n";
        }
        return salida;
    }
    
    public String[][] getMatriz(){
        String[][] matriz=new String[listaLibros.size()][Libro.getTamanno()];
        for(int fila=0;fila<matriz.length;fila++){
            for(int colum=0;colum<matriz[fila].length;colum++){
                matriz[fila][colum]=listaLibros.get(fila).datos(colum);
            }
        }
        return matriz;
    }

}
