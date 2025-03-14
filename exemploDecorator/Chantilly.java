// Decorador Concreto - Chantilly
class Chantilly extends CafeDecorator {
    public Chantilly(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String descricao() {
        return cafeDecorado.descricao() + ", Chantilly";
    }

    @Override
    public double custo() {
        return cafeDecorado.custo() + 2.00;
    }
}

