// ConcreteVisitor - Operação para calcular o preço total do computador
class PrecoComputadorVisitor implements ComponenteComputadorVisitor {
    private double totalPreco = 0;

    @Override
    public void visitar(CPU cpu) {
        totalPreco += cpu.getPreco();
    }

    @Override
    public void visitar(Memoria memoria) {
        totalPreco += memoria.getPreco();
    }

    @Override
    public void visitar(Disco disco) {
        totalPreco += disco.getPreco();
    }

    public double getTotalPreco() {
        return totalPreco;
    }
}