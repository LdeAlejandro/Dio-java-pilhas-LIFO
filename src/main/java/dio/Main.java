package dio;

public class Main {

    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);
        No no6 = new No(6);
        No no7 = new No(999);

        System.out.println("Pilha vazia: " + minhaPilha.isEmpty());
        minhaPilha.push(no1);
        minhaPilha.push(no2);
        minhaPilha.push(no3);
        minhaPilha.push(no4);
        minhaPilha.push(no5);
        minhaPilha.push(no6);
        minhaPilha.push(no7);
        System.out.println("Pilha vazia: " + minhaPilha.isEmpty());
        System.out.println("Topo da pilha: " + minhaPilha.top());
        System.out.println("Pilha: " + minhaPilha);
        System.out.println("Pop: " + minhaPilha.pop());
        System.out.println("Pilha: " + minhaPilha);
    }
}
