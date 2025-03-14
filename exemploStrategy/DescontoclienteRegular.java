// ConcreteStrategy - Estratégia de desconto para cliente regular
class DescontoClienteRegular implements EstrategiaDeDesconto {

    @Override
    public double aplicarDesconto(double preco) {
        System.out.println("Desconto para cliente regular: 5%");
        return preco * 0.95;  // 5% de desconto
    }
}