public abstract class Forma {
    //abstração
    protected Cor cor;

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public abstract void desenhar();
}
