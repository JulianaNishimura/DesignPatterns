// Cliente - Usa a fábrica para obter instâncias compartilhadas
class Arvore {
    private int x, y;
    private ArvoreTipo tipo;

    public Arvore(int x, int y, ArvoreTipo tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void desenhar() {
        tipo.desenhar(x, y);
    }
}