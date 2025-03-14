public class Cliente {
    public static void main(String[] args) {
        // Criando um construtor de lanches
        LancheManual cozinheiro = new LancheConcretoBuilder();

        // Criando um diretor
        ChefeCozinha chefe = new ChefeCozinha();

        // Montando o lanche simples
        Lanche lanche = chefe.montarLancheSimples(cozinheiro);

        // Exibindo o lanche pronto
        lanche.exibirPedido();
    }
}

