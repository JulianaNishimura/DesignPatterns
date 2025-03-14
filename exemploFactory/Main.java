public class Main {
    public static void main(String[] args) {
        Pizzaria pizzaria1 = new PizzariaCalabresa();
        PizzaProduto pizza1 = pizzaria1.criarPizza();
        pizza1.preparar();

        Pizzaria pizzaria2 = new PizzariaQueijo();
        PizzaProduto pizza2 = pizzaria2.criarPizza();
        pizza2.preparar();
    }
}