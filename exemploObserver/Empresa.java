import java.util.ArrayList;
import java.util.List;

// ConcreteSubject - Implementação do sujeito (Empresa)
class Empresa implements Sujeito {
    private String mensagem;
    private List<Observador> observadores = new ArrayList<>();

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(mensagem);
        }
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
        notificarObservadores();
    }
}