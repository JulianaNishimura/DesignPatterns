// Decorador Concreto - Leite
class Leite extends CafeDecorator {
    public Leite(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String descricao() {
        return cafeDecorado.descricao() + ", Leite";
    }

    @Override
    public double custo() {
        return cafeDecorado.custo() + 1.50;
    }
}