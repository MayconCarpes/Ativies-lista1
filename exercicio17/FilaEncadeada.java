package exercicio17;

public class FilaEncadeada<T extends Comparable<T>> {

    private No<T> inicio;
    private No<T> fim;

    public FilaEncadeada() {
        this.inicio = null;
        this.fim = null;

    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void enqueue(T objeto) {
        No<T> novoNo = new No<>();
        novoNo.setValor(objeto);
        novoNo.setProx(null);
        if (isEmpty()) {
            inicio = novoNo;
        } else {
            fim.setProx(novoNo);
        }
        fim = novoNo; // o novo nó agora é o fim da fila
    }

    public T dequeue() {
        T dadoRemovido = inicio.getValor(); // obter o dado no início da fila
        inicio = inicio.getProx(); // avançar o início para o próximo nó
        if (inicio == null) {
            fim = null;
        }
        return dadoRemovido;
    }

    public void percorrerFila() {
        if (this.isEmpty()) {
            System.out.println("Fila vazia!");
        } else {
            No<T> controle = inicio;
            System.out.println("Fila:");
            while (controle != null) {
                System.out.println("Nome: " + controle.getValor());
                controle = controle.getProx();
            }
        }
    }

    public int posicaoFila(T elemento) {
        int cont = 1;
        No<T> controle = inicio;

        while (controle != null) {
            if (controle.getValor().equals(elemento)) {
                return cont;
            }
            controle = controle.getProx();
            cont++;
        }
        return -1;
    }

    public T ultimoElemento() {
        No<T> controle = inicio;
        No<T> ultimo = null;

        while (controle != null) {
            ultimo = controle;
            controle = controle.getProx();
        }

        if (ultimo != null) {
            return ultimo.getValor();
        }
        return null;
    }

    public int quantidadeElementos() {
        int cont = 0;
        No<T> controle = inicio;

        while (controle != null) {
            controle = controle.getProx();
            cont++;
        }
        return cont;
    }

    public boolean verificarOrdemCrescente() {
        if (this.isEmpty()) {
            return false;
        } else {
            No<T> controle = inicio;
            while (controle != null && controle.getProx() != null) {
                if(controle.getProx().getValor().compareTo(controle.getValor()) <= 0) {
                    return false;
                }
                controle = controle.getProx();
            }
            return true;
        }
    }
}
