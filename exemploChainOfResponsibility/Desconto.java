// Handler - Interface base para os manipuladores
abstract class Desconto {
    protected Desconto proximo;

    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    public abstract void aprovarDesconto(double percentual);
}