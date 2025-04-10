// Flyweight - Representa a parte compartilhada da árvore
class ArvoreTipo {
    private String nome;
    private String cor;
    private String textura;

    public ArvoreTipo(String nome, String cor, String textura) {
        this.nome = nome;
        this.cor = cor;
        this.textura = textura;
    }

    public void desenhar(int x, int y) {
        System.out.println("Desenhando " + nome + " na posição (" + x + ", " + y + ") com cor " + cor);
    }
}