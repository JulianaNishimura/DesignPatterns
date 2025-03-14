public class DocumentoRelatorio implements Documento {
    //prototipo concreto - classe concreta

    private String titulo;
    private String conteudo;

    public DocumentoRelatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public Documento clonar() {
        return new DocumentoRelatorio(this.titulo, this.conteudo);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Relatório: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
