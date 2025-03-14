// ConcreteClass - Preparar Café
class Cafe extends Bebida {

    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando café em pó...");
    }

    @Override
    protected void prepararLiquido() {
        System.out.println("Misturando café com água quente...");
    }
}