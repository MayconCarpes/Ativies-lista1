package exercicio12;

public class Teste12 {
    public static void main(String[] args) {
         FilaCircular fila = new FilaCircular(5);

        fila.enqueue("Elemento 1");
        fila.enqueue("Elemento 2");
        fila.enqueue("Elemento 3");

        System.out.println(fila.toString());

        fila.dequeue();

        fila.buscarNaFila("Elemento 1");
        
        fila.buscarNaFila("Elemento 2");
        
        System.out.println("-----------");
        
        System.out.println(fila.toString());
        
  
    }
}
