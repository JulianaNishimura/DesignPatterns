// Concreto - Implementação base do café
class CafeSimples implements Cafe {
    @Override
    public String descricao() {
        return "Café Simples";
    }

    @Override
    public double custo() {
        return 5.00; // Preço base
    }
}