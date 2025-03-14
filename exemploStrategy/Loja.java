// Context - A loja que aplica a estratégia de desconto
class Loja {
    private EstrategiaDeDesconto estrategiaDeDesconto;

    public Loja(EstrategiaDeDesconto estrategiaDeDesconto) {
        this.estrategiaDeDesconto = estrategiaDeDesconto;
    }

    public void setEstrategiaDeDesconto(EstrategiaDeDesconto estrategiaDeDesconto) {
        this.estrategiaDeDesconto = estrategiaDeDesconto;
    }

    public double calcularPrecoComDesconto(double preco) {
        return estrategiaDeDesconto.aplicarDesconto(preco);
    }
}
