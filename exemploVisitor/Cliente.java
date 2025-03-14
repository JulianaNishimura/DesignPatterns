public class Cliente {
    public static void main(String[] args) {
        // Criando os componentes do computador
        ComponenteComputador cpu = new CPU(500.00);
        ComponenteComputador memoria = new Memoria(200.00);
        ComponenteComputador disco = new Disco(150.00);

        // Criando os visitantes
        PrecoComputadorVisitor precoVisitor = new PrecoComputadorVisitor();
        DiagnosticoComputadorVisitor diagnosticoVisitor = new DiagnosticoComputadorVisitor();

        // Aceitando as visitas
        cpu.aceitar(precoVisitor);
        memoria.aceitar(precoVisitor);
        disco.aceitar(precoVisitor);

        // Mostrando o preço total
        System.out.println("Preço total do computador: R$" + precoVisitor.getTotalPreco());

        // Realizando diagnóstico
        System.out.println("\nRealizando diagnóstico:");
        cpu.aceitar(diagnosticoVisitor);
        memoria.aceitar(diagnosticoVisitor);
        disco.aceitar(diagnosticoVisitor);
    }
}
