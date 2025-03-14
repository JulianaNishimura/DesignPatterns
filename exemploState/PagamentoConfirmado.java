// ConcreteState - Estado: Pagamento confirmado
class PagamentoConfirmado implements EstadoDaMaquina {

    @Override
    public void realizarAcao(MaquinaDeVendas maquina) {
        System.out.println("Pagamento confirmado! Preparando o produto...");
        maquina.setEstado(new ProdutoEntregue());
    }
}
