package exercicio16;

public class Pilha {

    private int topo;
    private int[] elementos;

    public Pilha(int tamanho) {
        elementos = new int[tamanho];
        this.topo = -1;
    }

    public boolean isFull() {
        return topo == elementos.length - 1;

    }

    public boolean isEmpty() {
        return this.topo == -1;
    }

    public boolean push(int novoDado) {
        if (!this.isFull()) {
            this.topo++;
            elementos[topo] = novoDado;
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        int retorno = elementos[topo];
        topo--;
        return retorno;
    }

    public int size() {
        return topo + 1;
    }

    public int peek() {
        return elementos[topo];
    }

    public void limpar() {
        topo = -1;
        elementos = new int[10];
    }

    public void converterDecimal(int decimal, int base) {
        if (base < 2 || base > 8) {
            System.out.println("Base inválida. A base deve estar entre 2 e 8.");
            return;
        }

        while (decimal > 0) {
            int resto = decimal % base;
            decimal = decimal / base;
            this.push(resto);
        }
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        for (int i = topo; i >= 0; i--) {
            retorno.append(elementos[i]).append("\n");
        }
        retorno.append("-----------");
        return retorno.toString();
    }
}
