public class Cliente {
    public static void main(String[] args) {
        MaquinaDeVendas maquina = new MaquinaDeVendas();

        // Ação 1: A máquina começa aguardando o pagamento
        maquina.realizarAcao();  // Aguardando pagamento

        // Ação 2: Pagamento confirmado, o estado da máquina muda
        maquina.realizarAcao();  // Pagamento confirmado

        // Ação 3: Produto é entregue
        maquina.realizarAcao();  // Produto entregue
    }
}
