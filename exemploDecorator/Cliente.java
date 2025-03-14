public class Cliente {
    public static void main(String[] args) {
        //cliente
        Cafe cafe = new CafeSimples();
        System.out.println(cafe.descricao() + " -> R$ " + cafe.custo());

        // Adicionando leite
        cafe = new Leite(cafe);
        System.out.println(cafe.descricao() + " -> R$ " + cafe.custo());

        // Adicionando chantilly
        cafe = new Chantilly(cafe);
        System.out.println(cafe.descricao() + " -> R$ " + cafe.custo());

        // Adicionando chocolate
        cafe = new Chocolate(cafe);
        System.out.println(cafe.descricao() + " -> R$ " + cafe.custo());
    }
}
