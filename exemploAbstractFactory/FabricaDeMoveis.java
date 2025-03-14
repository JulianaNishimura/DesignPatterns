import produtos.Cadeira;
import produtos.Mesa;
import produtos.Sofa;

public interface FabricaDeMoveis {
    //fabrica abstrata
    Cadeira criarCadeira();
    Mesa criarMesa();
    Sofa criarSofa();
}
