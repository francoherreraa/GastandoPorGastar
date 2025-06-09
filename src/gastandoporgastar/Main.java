
package gastandoporgastar;


public class Main {

    
    public static void main(String[] args) {
        Arbol a = new Arbol();
        
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
        
        
        System.out.println("Inorden: ");
        a.recorrerInOrden();
        
        System.out.println("   ");
        System.out.println("Preorden: ");
        a.recorrerPreOrden();
    }
    
}
