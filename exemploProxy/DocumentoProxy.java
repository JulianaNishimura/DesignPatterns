// Proxy - Controla o acesso ao RealSubject
class DocumentoProxy implements Documento {
    private DocumentoReal documentoReal;
    private String usuario;
    private boolean temPermissao;

    public DocumentoProxy(String usuario, boolean temPermissao, String conteudo) {
        this.usuario = usuario;
        this.temPermissao = temPermissao;
        this.documentoReal = new DocumentoReal(conteudo);
    }

    @Override
    public void exibir() {
        if (temPermissao) {
            System.out.println("Acesso permitido para " + usuario);
            documentoReal.exibir();
        } else {
            System.out.println("Acesso negado para " + usuario + ". Você não tem permissão!");
        }
    }
}