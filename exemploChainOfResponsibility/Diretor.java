// ConcreteHandler - Diretor aprova qualquer desconto acima de 10%
class Diretor extends Desconto {
    @Override
    public void aprovarDesconto(double percentual) {
        System.out.println("Diretor aprovou o desconto de " + percentual + "%");
    }
}
