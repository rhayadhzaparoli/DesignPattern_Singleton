public class Main {
    public static void main(String[] args) {
        Fila fila = Fila.getInstance(); // obtém a única instância da fila
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        System.out.println("Fila: " + fila); // imprime a fila

        int primeiro = fila.dequeue();
        System.out.println("Primeiro elemento da fila: " + primeiro);
        System.out.println("Fila depois de remover o primeiro elemento: " + fila); // imprime a fila depois de remover o primeiro elemento
    }
}
