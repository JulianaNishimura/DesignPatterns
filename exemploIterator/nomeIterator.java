import java.util.List;

// Implementação do iterador para uma lista de nomes
class NomeIterator implements Iterador<String> {
    private List<String> nomes;
    private int posicao = 0;

    public NomeIterator(List<String> nomes) {
        this.nomes = nomes;
    }

    @Override
    public boolean temProximo() {
        return posicao < nomes.size();
    }

    @Override
    public String proximo() {
        if (this.temProximo()) {
            return nomes.get(posicao++);
        }
        return null;
    }
}
