import java.util.ArrayList;
import java.util.List;

// Caretaker - Armazena o memento e pode restaurá-lo
class Historico {
    private List<Memento> estadosSalvos = new ArrayList<>();

    public void adicionarMemento(Memento memento) {
        estadosSalvos.add(memento);
    }

    public Memento getMemento(int indice) {
        return estadosSalvos.get(indice);
    }
}