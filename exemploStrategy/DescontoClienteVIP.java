// ConcreteStrategy - Estratégia de desconto para cliente VIP
class DescontoClienteVIP implements EstrategiaDeDesconto {

    @Override
    public double aplicarDesconto(double preco) {
        System.out.println("Desconto para cliente VIP: 15%");
        return preco * 0.85;  // 15% de desconto
    }
}