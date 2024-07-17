package exercicio12;

public class FilaCircular {

    private int inicio = 0;
    private int fim = -1;
    private int qtd = 0;
    private final String[] elementos;

    public FilaCircular(int tamanho) {
        this.inicio = 0;
        this.fim = -1;
        this.qtd = 0;
        this.elementos = new String[tamanho];
    }


    public boolean isFull() {
        return this.qtd == this.elementos.length;
    }


    public boolean enqueue(String elemento) {
        if (!this.isFull()) {
            if (this.fim == this.elementos.length - 1) {
                this.fim = 0;
            } else {
                this.fim++;
            }
            this.elementos[this.fim] = elemento;
            this.qtd++;
            return true;
        }
        return false;
    }


    public String dequeue() {
        String valor = this.elementos[this.inicio];
        if (this.inicio == this.elementos.length - 1) {
            this.inicio = 0;
        } else {
            this.inicio++;
        }
        this.qtd--;
        return valor;
    }

    public boolean isEmpty() {
        return this.qtd == 0;
    }


    public String first() {
        return this.elementos[this.inicio];
    }


    public String last() {
        return this.elementos[this.fim];
    }


    public void buscarNaFila(String el) {

        boolean elementoEncontrado = false;

        for (int i = 0; i < qtd; i++) {
            int indice = (inicio + i) % elementos.length; // indice atual dentro do array, primeiro calcula a posição absoluta na fila, depois garante que o índice esteja nos limites do array
            // indice = (3 + 2) % 5
            // = 5 % 5
            // = 0
            
            if (el.equals(elementos[indice])) {
                elementoEncontrado = true;
                break;
            }
        }

        if (elementoEncontrado) {
            System.out.println("Elemento encontrado na fila!");
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        int indice = inicio;
        for (int i = 0; i < qtd; i++) {
            retorno.append(elementos[indice]).append("\n");
            indice = (indice + 1) % elementos.length;
        }
        retorno.append("-----//------");
        return retorno.toString();
    }

}
