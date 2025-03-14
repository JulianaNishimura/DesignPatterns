// ConcreteClass - Preparar Chá
class Cha extends Bebida {

    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando folhas de chá...");
    }

    @Override
    protected void prepararLiquido() {
        System.out.println("Misturando chá com água quente...");
    }
}