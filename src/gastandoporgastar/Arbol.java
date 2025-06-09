package gastandoporgastar;

import java.util.ArrayList;

public class Arbol {

    Nodo inicial;

    public Arbol() {
        this.inicial = null;
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
            inOrden(nodo.getNodoIzq());
            inOrden(nodo.getNodoDer());
            System.out.println(nodo.getValor());
        }
    }

    public void buscarMasCercano(int presupuesto) {
        if (inicial == null) {
            System.out.println("El árbol está vacío. No hay precios cargados ");
            return;
        }
        Nodo actual = inicial;
        int masCercano = actual.getValor();
        int diferenciaMinima = Math.abs(actual.getValor() - presupuesto);
        ArrayList<Integer> camino = new ArrayList<>();

        while (actual != null) {
            camino.add(actual.getValor());
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

        System.out.println("Camino recorrido:");
        for (int valor : camino) {
            System.out.print(valor + " ");
        }
    }
}
