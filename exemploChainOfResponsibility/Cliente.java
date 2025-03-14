public class Cliente{
public static void main(String[] args) {
    // Criando os manipuladores
    Desconto vendedor = new Vendedor();
    Desconto gerente = new Gerente();
    Desconto diretor = new Diretor();

    // Configurando a cadeia de responsabilidade
    vendedor.setProximo(gerente);
    gerente.setProximo(diretor);

    // Testando diferentes descontos
    System.out.println("Solicitando 3% de desconto:");
    vendedor.aprovarDesconto(3);

    System.out.println("\nSolicitando 8% de desconto:");
    vendedor.aprovarDesconto(8);

    System.out.println("\nSolicitando 15% de desconto:");
    vendedor.aprovarDesconto(15);
    }
}
