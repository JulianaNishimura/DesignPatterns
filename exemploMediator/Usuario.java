// Colleague - Usuário no sistema de chat
class Usuario {
    private String nome;
    private ChatMediator mediador;

    public Usuario(String nome, ChatMediator mediador) {
        this.nome = nome;
        this.mediador = mediador;
    }

    public void enviarMensagem(String mensagem) {
        System.out.println(this.nome + " enviou: " + mensagem);
        mediador.enviarMensagem(mensagem, this);
    }

    public void receberMensagem(String mensagem) {
        System.out.println(this.nome + " recebeu: " + mensagem);
    }
}