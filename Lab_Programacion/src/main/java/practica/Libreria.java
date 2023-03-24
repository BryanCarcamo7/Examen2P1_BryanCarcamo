/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author Bryan Carcamo
 */
public class Libreria {
    private Arraylist  titulos;
    private Arraylist autores;

    public Libreria(Arraylist titulos, Arraylist autores) {
        this.titulos = titulos;
        this.autores = autores;
    }
    
    public Libreria(){
    
    }

    public Arraylist getTitulos() {
        return titulos;
    }

    public void setTitulos(Arraylist titulos) {
        this.titulos = titulos;
    }

    public Arraylist getAutores() {
        return autores;
    }

    public void setAutores(Arraylist autores) {
        this.autores = autores;
    }

   public String toString(){
   return "Titulo del libro"+titulos+", Autor"+autores;
   }

    void setAutores(String autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTitulos(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}

