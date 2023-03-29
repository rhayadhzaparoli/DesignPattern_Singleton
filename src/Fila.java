public class FilaDeImpressao {
    private static FilaDeImpressao instance = null;
    private Queue<String> queue;

    private FilaDeImpressao() {
        this.queue = new LinkedList<>();
    }

    public static synchronized FilaDeImpressao getInstance() {
        if (instance == null) {
            instance = new FilaDeImpressao();
        }
        return instance;
    }

    public synchronized void adicionarDocumento(String nomeDocumento) {
        this.queue.add(nomeDocumento);
    }

    public synchronized String removerDocumento() {
        return this.queue.poll();
    }

    public synchronized boolean estaVazia() {
        return this.queue.isEmpty();
    }
}