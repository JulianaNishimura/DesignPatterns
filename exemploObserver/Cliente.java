public class Cliente {
    public static void main(String[] args) {
        // Criando o sujeito (empresa)
        Empresa empresa = new Empresa();

        // Criando os observadores (funcionários)
        Funcionario funcionario1 = new Funcionario("Juliana");
        Funcionario funcionario2 = new Funcionario("Carlos");
        Funcionario funcionario3 = new Funcionario("Maria");

        // Adicionando os observadores à empresa
        empresa.adicionarObservador(funcionario1);
        empresa.adicionarObservador(funcionario2);
        empresa.adicionarObservador(funcionario3);

        // Atualizando a mensagem e notificando os observadores
        empresa.setMensagem("Reunião importante amanhã!");

        // Removendo um observador
        empresa.removerObservador(funcionario2);

        // Atualizando a mensagem novamente
        empresa.setMensagem("Nova reunião agendada para a próxima semana!");
    }
}
