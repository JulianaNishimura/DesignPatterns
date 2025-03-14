// ConcreteState - Estado: Aguardando pagamento
class AguardandoPagamento implements EstadoDaMaquina {

    @Override
    public void realizarAcao(MaquinaDeVendas maquina) {
        System.out.println("Aguardando pagamento...");
        maquina.setEstado(new PagamentoConfirmado());
    }
}