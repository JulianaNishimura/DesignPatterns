// ConcreteHandler - Gerente pode aprovar até 10%
class Gerente extends Desconto {
    @Override
    public void aprovarDesconto(double percentual) {
        if (percentual <= 10) {
            System.out.println("Gerente aprovou o desconto de " + percentual + "%");
        } else if (proximo != null) {
            proximo.aprovarDesconto(percentual);
        }
    }
}