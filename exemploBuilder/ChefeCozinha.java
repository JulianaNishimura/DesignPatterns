class ChefeCozinha {
    public Lanche montarLancheSimples(LancheManual cozinheiro) {
        cozinheiro.escolherPao("Branco");
        cozinheiro.escolherCarne("Frango");
        cozinheiro.escolherBebida("Refrigerante");
        return cozinheiro.construir();
    }
}
