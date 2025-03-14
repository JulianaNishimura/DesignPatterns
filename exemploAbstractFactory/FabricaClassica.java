import produtos.Cadeira;
import produtos.Mesa;
import produtos.Sofa;
import produtosconcretos.CadeiraClassica;
import produtosconcretos.MesaClassica;
import produtosconcretos.SofaClassico;

public class FabricaClassica implements FabricaDeMoveis {
    public Cadeira criarCadeira() {
        return new CadeiraClassica();
    }

    public Mesa criarMesa() {
        return new MesaClassica();
    }

    public Sofa criarSofa() {
        return new SofaClassico();
    }
}
