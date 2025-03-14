import produtos.Cadeira;
import produtos.Mesa;
import produtos.Sofa;
import produtosconcretos.CadeiraModerna;
import produtosconcretos.MesaModerna;
import produtosconcretos.SofaModerno;

public class FabricaModerna implements FabricaDeMoveis {
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    public Mesa criarMesa() {
        return new MesaModerna();
    }

    public Sofa criarSofa() {
        return new SofaModerno();
    }
}
