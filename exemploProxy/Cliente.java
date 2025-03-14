public class Cliente {
    public static void main(String[] args) {
        // Usuário com permissão
        Documento doc1 = new DocumentoProxy("Juliana", true, "Relatório Secreto");
        doc1.exibir();

        System.out.println();

        // Usuário sem permissão
        Documento doc2 = new DocumentoProxy("Eduardo", false, "Relatório Secreto");
        doc2.exibir();
    }
}
