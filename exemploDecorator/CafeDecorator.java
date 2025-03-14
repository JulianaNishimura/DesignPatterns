// Decorador - Classe abstrata para os adicionais
abstract class CafeDecorator implements Cafe {
    protected Cafe cafeDecorado;

    public CafeDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public String descricao() {
        return cafeDecorado.descricao();
    }

    @Override
    public double custo() {
        return cafeDecorado.custo();
    }
}

