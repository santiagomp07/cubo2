/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Alumno Mañana
 */
public class cubos {
    private int altura ;
    private int anchura ;
    private int profundidad ;
    
    //getter and setter

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }
    
    //constructores
    
    public cubos(int altura, int anchura, int profundidad) {
        this.altura = altura;
        this.anchura = anchura;
        this.profundidad = profundidad;
    }

    public cubos() {
    }

    @Override
    public String toString() {
        return "cubos{" + "altura=" + altura + ", anchura=" + anchura + ", profundidad=" + profundidad + '}';
    }
    
    public int volumen (int al, int an, int pr){
        return al*an*pr;
    }
    
}
