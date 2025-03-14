// Mediator - Interface para o mediador
interface ChatMediator {
    void enviarMensagem(String mensagem, Usuario usuario);
    void adicionarUsuario(Usuario usuario);
}