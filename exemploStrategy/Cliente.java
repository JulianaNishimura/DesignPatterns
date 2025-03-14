public class Cliente {
    public static void main(String[] args) {
        // Preço inicial do produto
        double precoProduto = 100.00;

        // Criando uma loja com a estratégia de desconto para cliente regular
        Loja loja = new Loja(new DescontoClienteRegular());
        double precoComDesconto = loja.calcularPrecoComDesconto(precoProduto);
        System.out.println("Preço final: " + precoComDesconto);

        // Mudando para a estratégia de desconto para cliente VIP
        loja.setEstrategiaDeDesconto(new DescontoClienteVIP());
        precoComDesconto = loja.calcularPrecoComDesconto(precoProduto);
        System.out.println("Preço final: " + precoComDesconto);

        // Mudando para a estratégia de desconto para promoção
        loja.setEstrategiaDeDesconto(new DescontoPromocao());
        precoComDesconto = loja.calcularPrecoComDesconto(precoProduto);
        System.out.println("Preço final: " + precoComDesconto);
    }
}
