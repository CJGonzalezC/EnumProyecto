/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumproyecto;

/**
 *
 * @author Administrador
 */


enum Lenguajes{
    JAVA,C(80),PHP(50),JAVASCRIPT(30);
    
    int dificultad;
    
    Lenguajes(){}
    
    Lenguajes(int dificultad){
        this.dificultad = dificultad;
    }
    
    public int getDificultad(){
        return dificultad;
    }
}
public class EnumProyecto {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Lenguajes.C.getDificultad());
        
        
        
    }
    
}
