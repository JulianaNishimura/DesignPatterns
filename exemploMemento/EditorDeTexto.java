// Originator - Editor de texto, que gera e restaura o memento
class EditorDeTexto {
    private String conteudo;

    public void escrever(String texto) {
        conteudo = texto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Memento salvarEstado() {
        return new Memento(conteudo);
    }

    public void restaurarEstado(Memento memento) {
        conteudo = memento.getConteudo();
    }
}