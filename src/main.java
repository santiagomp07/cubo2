
import dominio.cubos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno Mañana
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cubos c1 = new cubos(12,12,12);
        
        
        int res = c1.volumen(c1.getAltura(),c1.getAnchura(),
                c1.getProfundidad());
        System.out.println("el volumen de mi cubo es = "+res);
        
    }
    
    
}
