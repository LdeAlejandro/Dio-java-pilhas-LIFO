package dio;


public class No {

    // Valor armazenado no nó
    private int dado;

    // Referência do nó para o próximo nó
    private No refNo = null;

    // inicializar o nó
    public No() {

    }
    // inicializar o nó com dados
    public No(int dado) {
        this.dado = dado;
    }

    // Obter a referência do próximo nó
    public No getRefNo() {
        return refNo;
    }

    // Definir a referência do próximo nó
    public void setRefNo(No refNo) {
        // Define o próximo nó na sequência
        this.refNo = refNo;
    }

    // Obter o valor armazenado no nó
    public int getDado() {
        return dado;
    }

    // Atualiza o valor armazenado no nó
    public void setDado(int dado) {

        this.dado = dado;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
