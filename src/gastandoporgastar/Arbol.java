package gastandoporgastar;

import java.util.ArrayList;
import java.util.List;

public class Arbol {

    Nodo inicial;
    private List<Integer> caminoRecorrido;

    public Arbol() {
        this.inicial = null;
        this.caminoRecorrido = new ArrayList<>();
    }

    public void insertar(int valor) {
        if (this.inicial == null) {
            this.inicial = new Nodo(valor);
        } else {
            this.inicial.insertarValor(valor);
        }
    }

    public void recorrerPreOrden() {
        this.preOrden(this.inicial);
    }

    public void preOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            System.out.println(nodo.getValor());
            preOrden(nodo.getNodoIzq());
            preOrden(nodo.getNodoDer());
        }
    }

    public void recorrerInOrden() {
        this.inOrden(this.inicial);
    }

    public void inOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            inOrden(nodo.getNodoIzq());
            System.out.println(nodo.getValor());
            inOrden(nodo.getNodoDer());
        }
    }

    public void recorrerPostOrden() {
        this.postOrden(inicial);
    }

    public void postOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            postOrden(nodo.getNodoIzq());
            postOrden(nodo.getNodoDer());
            System.out.println(nodo.getValor());
        }
    }

    public void buscarMasCercano(int presupuesto) {
        if (inicial == null) {
            System.out.println("El árbol está vacío. No hay precios cargados ");
            return;
        }
        caminoRecorrido.clear();

        Nodo actual = inicial;
        int masCercano = actual.getValor();
        int diferenciaMinima = Math.abs(actual.getValor() - presupuesto);

        while (actual != null) {
            caminoRecorrido.add(actual.getValor());
            int diferencia = Math.abs(actual.getValor() - presupuesto);
            if (diferencia < diferenciaMinima) {
                diferenciaMinima = diferencia;
                masCercano = actual.getValor();
            }

            if (presupuesto < actual.getValor()) {
                actual = actual.getNodoIzq();
            } else if (presupuesto > actual.getValor()) {
                actual = actual.getNodoDer();
            } else {
                break;
            }

        }
        System.out.println("Valor mas cercano: " + masCercano);
        System.out.println("");
    }

    public void mostrarCaminoRecorrido() {
        if (caminoRecorrido.isEmpty()) {
            System.out.println("Todavía no se realizó ninguna búsqueda.");
            return;
        }
        System.out.println("Camino recorrido:");
        for (int valor : caminoRecorrido) {
            System.out.print(valor + " " );
              
        }
    }
}
