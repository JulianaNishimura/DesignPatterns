class LancheConcretoBuilder implements LancheManual {
    private String pao;
    private String carne;
    private String bebida;

    @Override
    public void escolherPao(String pao) {
        this.pao = pao;
    }

    @Override
    public void escolherCarne(String carne) {
        this.carne = carne;
    }

    @Override
    public void escolherBebida(String bebida) {
        this.bebida = bebida;
    }

    @Override
    public Lanche construir() {
        return new Lanche(pao, carne, bebida);
    }
}
