
package gastandoporgastar;


public class Arbol {
    Nodo inicial;
    
    public Arbol(){
        this.inicial = null;
    }
    
    public void insertar(int valor){
        if(this.inicial == null){
            this.inicial = new Nodo(valor);
        }else{
            this.inicial.insertarValor(valor);
        }
    }
    
    public void recorrerPreOrden(){
        this.preOrden(this.inicial);
    }
    
    public void preOrden(Nodo nodo){
        if(nodo == null){
            return; //terminar recursividad
        }else{
            System.out.println(nodo.getValor());
            preOrden(nodo.getNodoIzq());
            preOrden(nodo.getNodoDer());
        }
    }
    
    
    public void recorrerInOrden(){
        this.inOrden(this.inicial);
    }
    
    public void inOrden(Nodo nodo){
        if(nodo == null){
            return; //terminar recursividad
        }else{
            inOrden(nodo.getNodoIzq());
            System.out.println(nodo.getValor());
            inOrden(nodo.getNodoDer());
        }
    }
    
    public void recorrerPostOrden(){
        
    }
    
    public void postOrden(Nodo nodo){
        if(nodo == null){
            return; //terminar recursividad
        }else{
            inOrden(nodo.getNodoIzq());
            inOrden(nodo.getNodoDer());
            System.out.println(nodo.getValor());
        }
    }
}
