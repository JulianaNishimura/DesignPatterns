public class Cliente {
    public static void main(String[] args) {
        // Criando o mediador
        ChatMediator mediadorDeChat = new MediadorDeChatImpl();

        // Criando os usuários
        Usuario usuario1 = new Usuario("Juliana", mediadorDeChat);
        Usuario usuario2 = new Usuario("Carlos", mediadorDeChat);
        Usuario usuario3 = new Usuario("Maria", mediadorDeChat);

        // Adicionando os usuários ao mediador
        mediadorDeChat.adicionarUsuario(usuario1);
        mediadorDeChat.adicionarUsuario(usuario2);
        mediadorDeChat.adicionarUsuario(usuario3);

        // Enviando mensagens
        usuario1.enviarMensagem("Olá, pessoal!");
        usuario2.enviarMensagem("Oi, Juliana! Como vai?");
        usuario3.enviarMensagem("Oi, pessoal!");
    }
}
