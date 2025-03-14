public class PizzariaCalabresa extends Pizzaria {
    //fabrica concreta
    @Override
    public PizzaProduto criarPizza() {
        return new PizzaCalabresa();
    }
}
