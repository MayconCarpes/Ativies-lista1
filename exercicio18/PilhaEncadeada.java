package exercicio18;

import java.util.NoSuchElementException;

public class PilhaEncadeada<T> {

    private No<T> topo;
    private int size;

    public PilhaEncadeada() {
        this.topo = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public boolean push(T valor) {
        No<T> novoNo = new No<>(valor);
        if (novoNo == null) {
            return false;
        }
        novoNo.setProx(topo);
        topo = novoNo;
        size++;
        return true;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia");
        }
        No<T> noRemovido = topo;
        topo = topo.getProx();
        size--;
        return noRemovido.getValor();
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia");
        }
        return topo.getValor();
    }
    
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        No<T> atual = topo;
        while (atual != null) {
            retorno.append(atual.getValor()).append("\n");
            atual = atual.getProx();
        }
        retorno.append("-----------");
        return retorno.toString();
    }
}
