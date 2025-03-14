public class Circulo extends Forma {
    //forma concreta
    public Circulo(Cor cor) {
        super(cor);
    }

    @Override
    public void desenhar() {
        System.out.print("Desenhando um círculo - ");
        cor.aplicarCor();
    }
}
