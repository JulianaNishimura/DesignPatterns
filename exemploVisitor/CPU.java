// ConcreteElement - Componente CPU
class CPU implements ComponenteComputador {
    private double preco;

    public CPU(double preco) {
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