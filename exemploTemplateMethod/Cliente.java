public class Cliente {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        System.out.println("Preparando Café:");
        cafe.prepararBebida();

        System.out.println("\nPreparando Chá:");
        Bebida cha = new Cha();
        cha.prepararBebida();
    }
}
