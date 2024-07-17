package exercicio18;

public class Teste {

    public static void main(String[] args) {
        PilhaEncadeada<Integer> pilha = new PilhaEncadeada<>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println("Topo: " + pilha.peek());
    }
}
