class Arquivo implements ArquivoSistema {
    //folha - arquivo individual
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "- " + nome);
    }
}