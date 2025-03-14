public class Cliente {
    public static void main(String[] args) {
        EditorDeTexto editor = new EditorDeTexto();
        Historico historico = new Historico();

        // Escrevendo o conteúdo no editor
        editor.escrever("Texto inicial.");
        System.out.println("Conteúdo atual: " + editor.getConteudo());

        // Salvando o estado do editor
        historico.adicionarMemento(editor.salvarEstado());

        // Escrevendo mais texto
        editor.escrever("Texto alterado.");
        System.out.println("Conteúdo atual: " + editor.getConteudo());

        // Salvando o novo estado
        historico.adicionarMemento(editor.salvarEstado());

        // Restaurando o estado anterior
        editor.restaurarEstado(historico.getMemento(0));
        System.out.println("Conteúdo restaurado: " + editor.getConteudo());
    }
}
