// ConcreteElement - Componente Memória
class Memoria implements ComponenteComputador {
    private double preco;

    public Memoria(double preco) {
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