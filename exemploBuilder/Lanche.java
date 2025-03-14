public class Lanche {
    private String pao;
    private String carne;
    private String bebida;

    public Lanche(String pao, String carne, String bebida) {
        this.pao = pao;
        this.carne = carne;
        this.bebida = bebida;
    }

    public void exibirPedido() {
        System.out.println("Lanche: Pão " + pao + ", Carne " + carne + ", Bebida " + bebida);
    }
}
