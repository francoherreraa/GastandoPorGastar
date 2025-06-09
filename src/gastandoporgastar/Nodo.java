
package gastandoporgastar;


public class Nodo {
    private int valor;
    private Nodo nodoIzq;
    private Nodo nodoDer;

    public Nodo(int valor) {
        this.valor = valor;
        this.nodoIzq = null;
        this.nodoDer = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }
    
    public void insertarValor(int _valor){
        if(_valor < this.valor){
            //insertamos en lado izquierdo
            if(this.nodoIzq == null){
                this.nodoIzq = new Nodo(_valor);
            }else{
                this.nodoIzq.insertarValor(_valor);
            }
        }else{
            //insertar en lado derecho
            if(this.nodoDer == null){
                this.nodoDer = new Nodo(_valor);
            }else{
                this.nodoDer.insertarValor(_valor);
            }
        }
    }
}
