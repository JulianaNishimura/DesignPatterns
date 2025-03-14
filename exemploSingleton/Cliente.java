public class Cliente {
    public static void main(String[] args) {
        // Obtendo a única instância do Singleton
        Configuracao config1 = Configuracao.getInstancia();
        System.out.println("Configuração Inicial: " + config1.getConfiguracao());

        // Modificando a configuração
        config1.setConfiguracao("Modo Avançado");

        // Obtendo a instância novamente
        Configuracao config2 = Configuracao.getInstancia();
        System.out.println("Nova Configuração: " + config2.getConfiguracao());

        // Verificando se ambas as instâncias são a mesma
        System.out.println("As instâncias são iguais? " + (config1 == config2));
    }
}
