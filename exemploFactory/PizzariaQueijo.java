public class PizzariaQueijo extends Pizzaria {
    //fabrica concreta
    @Override
    public PizzaProduto criarPizza() {
        return new PizzaQueijo();
    }
}
