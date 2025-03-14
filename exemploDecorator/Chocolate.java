// Decorador Concreto - Chocolate
class Chocolate extends CafeDecorator {
    public Chocolate(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String descricao() {
        return cafeDecorado.descricao() + ", Chocolate";
    }

    @Override
    public double custo() {
        return cafeDecorado.custo() + 2.50;
    }
}