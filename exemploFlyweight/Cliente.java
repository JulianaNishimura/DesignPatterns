public class Cliente {
    public static void main(String[] args) {
        // Criando árvores usando Flyweight
        Arvore arvore1 = new Arvore(10, 20, ArvoreFactory.getArvoreTipo("Carvalho", "Verde", "Rugosa"));
        Arvore arvore2 = new Arvore(15, 30, ArvoreFactory.getArvoreTipo("Pinheiro", "Verde", "Lisa"));
        Arvore arvore3 = new Arvore(10, 20, ArvoreFactory.getArvoreTipo("Carvalho", "Verde", "Rugosa")); // Reutiliza objeto!

        // Desenhando árvores
        arvore1.desenhar();
        arvore2.desenhar();
        arvore3.desenhar(); // Usa o mesmo objeto da arvore1!
    }
}