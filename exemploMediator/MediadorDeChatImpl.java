import java.util.ArrayList;
import java.util.List;

// ConcreteMediator - Implementação do Mediador
class MediadorDeChatImpl implements ChatMediator {
    private List<Usuario> usuarios;

    public MediadorDeChatImpl() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario usuario) {
        for (Usuario u : usuarios) {
            // Não envia a mensagem para o usuário que a enviou
            if (u != usuario) {
                u.receberMensagem(mensagem);
            }
        }
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
