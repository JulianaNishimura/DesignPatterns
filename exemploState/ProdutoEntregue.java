// ConcreteState - Estado: Produto entregue
class ProdutoEntregue implements EstadoDaMaquina {

    @Override
    public void realizarAcao(MaquinaDeVendas maquina) {
        System.out.println("Produto entregue! Venda concluída.");
    }
}