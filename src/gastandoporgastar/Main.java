
package gastandoporgastar;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        Arbol a = new Arbol();
        Scanner sc = new Scanner(System.in);
        int num;
        
//        do{
//            System.out.println("Menu de opciones");
//            System.out.println("1- insertar producto");
//            System.out.println("2- Cargar productos predeterminados");
//            System.out.println("3- Buscar producto en base a presupuesto");
//            System.out.println("4- Mostrar camino");
//            System.out.println("");
//            System.out.println("Ingrese una opcion: ");
//            num = sc.nextInt();
//            
//            switch(num){
//                case 2:a.insertar(290);
//        a.insertar(180);
//        a.insertar(100);
//        a.insertar(220);
//        a.insertar(230);
//        a.insertar(400);
//        a.insertar(310);
//        a.insertar(480);
//        a.insertar(440);
//        a.insertar(500);
//            }
//        }while(num !=0);
        a.insertar(290);
        a.insertar(180);
        a.insertar(100);
        a.insertar(220);
        a.insertar(230);
        a.insertar(400);
        a.insertar(310);
        a.insertar(480);
        a.insertar(440);
        a.insertar(500);
        
        a.buscarMasCercano(170);
        System.out.println("  ");
        System.out.println("Inorden: ");
        a.recorrerInOrden();
        
        System.out.println("   ");
        System.out.println("Preorden: ");
        a.recorrerPreOrden();
        
        System.out.println("PostOrden");
        a.recorrerPostOrden();
    }
    
}
