// ConcreteElement - Componente Disco
class Disco implements ComponenteComputador {
    private double preco;

    public Disco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void aceitar(ComponenteComputadorVisitor visitor) {
        visitor.visitar(this);
    }
}