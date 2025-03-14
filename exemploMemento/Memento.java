// Memento - Armazena o estado do editor de texto
class Memento {
    private String conteudo;

    public Memento(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }
}