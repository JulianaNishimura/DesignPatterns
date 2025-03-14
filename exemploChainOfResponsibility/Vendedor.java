// ConcreteHandler - Vendedor pode aprovar até 5%
class Vendedor extends Desconto {
    @Override
    public void aprovarDesconto(double percentual) {
        if (percentual <= 5) {
            System.out.println("Vendedor aprovou o desconto de " + percentual + "%");
        } else if (proximo != null) {
            proximo.aprovarDesconto(percentual);
        }
    }
}