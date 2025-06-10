package gastandoporgastar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Arbol a = new Arbol();
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Menu de opciones");
            System.out.println("1- Insertar producto");
            System.out.println("2- Cargar productos predeterminados");
            System.out.println("3- Buscar producto en base a presupuesto");
            System.out.println("4- Mostrar camino");
            System.out.println("5- Mostrar productos en un orden especifico");
            System.out.println("0- Salir");
            System.out.println("");
            System.out.println("Ingrese una opcion: ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Ingrese un producto");
                    num = sc.nextInt();
                    a.insertar(num);
                    System.out.println("Producto ingresado con exito");
                    break;

                case 2:
                    System.out.println("Los siguientes valores han sido insertados:");
                    System.out.println("290, 180, 400, 100, 220, 310, 480, 230, 440, 500");
                    System.out.println("");
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
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Ingrese su presupuesto ");
                    int presupuesto = sc.nextInt();
                    a.buscarMasCercano(presupuesto);
                    System.out.println("  ");
                    break;

                case 4:
                    a.mostrarCaminoRecorrido();
                    break;
                case 5:
                    System.out.println("Elija el tipo de recorrido:");
                    System.out.println("1- Inorden");
                    System.out.println("2- Preorden");
                    System.out.println("3- Postorden");
                    int orden = sc.nextInt();

                    switch (orden) {
                        case 1:
                            System.out.println("Recorrido Inorden");
                            a.recorrerInOrden();
                            break;

                        case 2:
                            System.out.println("Recorrido Preorden");
                            a.recorrerPreOrden();
                            break;

                        case 3:
                            System.out.println("Recorrido Postorden");
                            a.recorrerPostOrden();
                            break;

                        default:
                            System.out.println("Opcion invalida. Elija una opcion entre el 1 y el 3 ");
                    }
                    break;
                default:
                    System.out.println("Opcion invalida. Elija una opcion entre el 0 y el 5 ");
            }
        } while (num != 0);
    }
}
