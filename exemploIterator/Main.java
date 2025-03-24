public class Main {
    public static void main(String[] args) {
        ColecaoNomes colecao = new ColecaoNomes();
        colecao.adicionarNome("Alice");
        colecao.adicionarNome("Bob");
        colecao.adicionarNome("Carlos");

        Iterador<String> iterador = colecao.criarIterator();

        while (iterador.temProximo()) {
            System.out.println(iterador.proximo());
        }
    }
}
