package dio;

public class Pilha {

    // Referência para o nó no topo da pilha
    private No refNoEntradaPilha;

    // inicializar a referência como null (pilha vazia)
    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    // Método para obter o nó no topo da pilha sem removê-lo
    public No top() {
        // Retorna a referência do topo da pilha
        return refNoEntradaPilha;
    }

    // Método para adicionar um nó no topo da pilha (push)
    public void push(No novoNo) {
        // Armazena a referência atual do topo em uma variável auxiliar
        No refAuxiliar = refNoEntradaPilha;

        // Define o novo nó como o topo da pilha
        refNoEntradaPilha = novoNo;

        // Ajusta a referência do novo nó para apontar para o nó anterior (o antigo topo)
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    // Método para remover o nó do topo da pilha (pop)
    public No pop() {
        // Verifica se a pilha não está vazia antes de tentar remover
        if (!this.isEmpty()) {
            // Armazena o nó atual do topo em uma variável temporária
            No noPopped = refNoEntradaPilha;

            // Atualiza o topo da pilha para o próximo nó (abaixo do atual)
            refNoEntradaPilha = noPopped.getRefNo();
        }
        // Retorna null caso a pilha esteja vazia ou não haja nó para remover
        return null;
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "---------------------------";
        strRetorno = "Pilha \n";
        strRetorno += "---------------------------\n";

        // Variável auxiliar para percorrer os nós da pilha
        No noAuxiliar = refNoEntradaPilha;

        // Enquanto a variável auxiliar não for nula (há nós na pilha)
        while (noAuxiliar != null) {
            // Adicionando dados do Nó atual para strRetorno
            strRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";

            // Move para o próximo nó da pilha pela referencia
            noAuxiliar = noAuxiliar.getRefNo();
        }

        strRetorno += "===========================\n";

        return strRetorno;
    }

}
