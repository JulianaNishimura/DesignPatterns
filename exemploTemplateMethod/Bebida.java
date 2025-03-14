// AbstractClass - Classe abstrata com o Template Method
abstract class Bebida {

    // Template Method
    public final void prepararBebida() {
        ferverAgua();
        adicionarIngrediente();
        prepararLiquido();
        servir();
    }

    private void ferverAgua() {
        System.out.println("Fervendo água...");
    }

    // Este método será implementado pelas subclasses
    protected abstract void adicionarIngrediente();

    // Este método será implementado pelas subclasses
    protected abstract void prepararLiquido();

    private void servir() {
        System.out.println("Servindo a bebida...");
    }
}