// ConcreteStrategy - Estratégia de desconto para promoção
class DescontoPromocao implements EstrategiaDeDesconto {

    @Override
    public double aplicarDesconto(double preco) {
        System.out.println("Desconto para promoção: 20%");
        return preco * 0.80;  // 20% de desconto
    }
}