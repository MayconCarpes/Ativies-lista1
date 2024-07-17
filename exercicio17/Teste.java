package exercicio17;

public class Teste{

    public static void main(String[] args) {
        FilaEncadeada<Integer> fila = new FilaEncadeada<>();
        FilaEncadeada<Integer> fila2 = new FilaEncadeada<>();
        
        fila.enqueue(1);
        fila.enqueue(3);
        fila.enqueue(5);
        fila.enqueue(7);
        
        fila.percorrerFila();
        String ordem = fila.verificarOrdemCrescente() ? "Esta em ordem crescente!"  : "Nao esta em ordem crescente!";
        System.out.println(ordem);
        
        System.out.println();
        fila2.enqueue(6);
        fila2.enqueue(4);
        fila2.enqueue(2);
        fila2.enqueue(1); 
        
        fila2.percorrerFila();
        ordem = fila2.verificarOrdemCrescente() ? "Esta em ordem crescente!"  : "Nao esta em ordem crescente!";
        System.out.println(ordem);
        
    }

}
