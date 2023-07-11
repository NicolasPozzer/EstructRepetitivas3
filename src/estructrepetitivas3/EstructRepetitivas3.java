package estructrepetitivas3;

import java.util.Scanner;

/**
 *
 * @author nico-
 */
public class EstructRepetitivas3 {


    public static void main(String[] args) {
        String dni;
        String nombre;
        int edad;
        
        
        System.out.println("\nIgrese el DNI: ");
        Scanner teclado = new Scanner(System.in);
        dni = teclado.next();
        
        System.out.println("Igrese el Nombre: ");
        Scanner teclado2 = new Scanner(System.in);
        nombre = teclado2.next();
        
        System.out.println("Igrese el edad: ");
        Scanner teclado3 = new Scanner(System.in);
        edad = teclado3.nextInt();
        
        
        while(!dni.equals("0") || !nombre.equals("fin")){
            
                if(edad >= 6 && edad <= 10){
                    System.out.println("Pertenece a la categoria Menores A");
            }
                if(edad >= 11 && edad <= 17){
                    System.out.println("Pertenece a la categoria Menores B");
            }
                if(edad >= 18 && edad <= 30){
                    System.out.println("Pertenece a la categoria Juveniles");
            }
                if(edad >= 31 && edad <= 50){
                    System.out.println("Pertenece a la categoria Adultos");
            }
                if(edad > 50){
                    System.out.println("Pertenece a la categoria Adultos mayores");
            }
                if(edad < 6){
                    System.out.println("No existe categoria para esta edad!!");
                }
                
                
                
                System.out.println("\nIgrese el DNI: ");
                dni = teclado.next();
                System.out.println("Igrese el Nombre: ");
                nombre = teclado2.next();
                System.out.println("Igrese el edad: ");
                edad = teclado3.nextInt();
        }
        
        System.out.println("\nFin de Proceso");
    }
    
}
