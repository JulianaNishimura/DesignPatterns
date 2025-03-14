public class Main {
    public static void main(String[] args) {

        Cor vermelho = new Vermelho();
        Cor azul = new Azul();

        Forma circuloVermelho = new Circulo(vermelho);
        Forma quadradoAzul = new Quadrado(azul);

        circuloVermelho.desenhar();
        quadradoAzul.desenhar();
    }
}
