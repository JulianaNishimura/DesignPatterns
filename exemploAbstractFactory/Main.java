import produtos.Cadeira;
import produtos.Mesa;
import produtos.Sofa;

public class Main {
    public static void main(String[] args) {
        FabricaDeMoveis fabrica = new FabricaModerna();

        Cadeira cadeira = fabrica.criarCadeira();
        Mesa mesa = fabrica.criarMesa();
        Sofa sofa = fabrica.criarSofa();

        cadeira.sentar();
        mesa.usar();
        sofa.deitar();

        System.out.println("-----");

        fabrica = new FabricaClassica();

        cadeira = fabrica.criarCadeira();
        mesa = fabrica.criarMesa();
        sofa = fabrica.criarSofa();

        cadeira.sentar();
        mesa.usar();
        sofa.deitar();
    }
}
