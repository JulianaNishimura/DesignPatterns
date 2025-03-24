import java.util.ArrayList;
import java.util.List;

// Classe que representa uma coleção de nomes
class ColecaoNomes {
    private List<String> nomes = new ArrayList<>();

    public void adicionarNome(String nome) {
        nomes.add(nome);
    }

    public Iterador<String> criarIterator() {
        return new NomeIterator(nomes);
    }
}
