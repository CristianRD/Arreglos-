/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalpunto1;

/**
 *
 * @author User
 */
public class Academia {
    
 
    String niveles[] ={"Basico", "Medio Basico","Medio Avanzado","Perfeccionamiento"}; 
    String idiomas [] = {"Ingles", "Frances", "Aleman","Ruso","Italiano","Mandarin"};
    int numeroAlumnos[][]= new int [4][6];
    
    Academia(){
        
        numeroAlumnos[0][0] = 27;
        numeroAlumnos[0][1] = 41;
        numeroAlumnos[0][2] = 28;
        numeroAlumnos[0][3] = 13;
        numeroAlumnos[0][4] = 46;
        numeroAlumnos[0][5] = 19;
        numeroAlumnos[1][0] = 47;
        numeroAlumnos[1][1] = 23;
        numeroAlumnos[1][2] = 33;
        numeroAlumnos[1][3] = 13;
        numeroAlumnos[1][4] = 14;
        numeroAlumnos[1][5] = 14;
        numeroAlumnos[2][0] = 56;
        numeroAlumnos[2][1] = 26;
        numeroAlumnos[2][2] = 13;
        numeroAlumnos[2][3] = 12;
        numeroAlumnos[2][4] = 16;
        numeroAlumnos[2][5] = 11;
        numeroAlumnos[3][0] = 10;
        numeroAlumnos[3][1] = 21;
        numeroAlumnos[3][2] = 51;
        numeroAlumnos[3][3] = 11;
        numeroAlumnos[3][4] = 16;
        numeroAlumnos[3][5] = 19;
       
    }
    
    
    public void mostrarMatriz(){
    
        for(int i = 0; i<numeroAlumnos.length;i++){
            
            for (int j=0;j<numeroAlumnos[i].length;j++){
            
                System.out.println("Hay "+numeroAlumnos[i][j]+" Alumnos  En el nivel "+ niveles[i]+
                        "\ndel idioma "+ idiomas[j]);
            
            }
        
        }
    }
    
}


