package dio;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public void push(No novoNo){
        No refAuxiliar =  refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public void pop(){
        if(!this.isEmpty()) {
            No noPopped = refNoEntradaPilha;
            refNoEntradaPilha = noPopped.getRefNo();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }
}
