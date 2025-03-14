// ConcreteVisitor - Operação para diagnóstico dos componentes
class DiagnosticoComputadorVisitor implements ComponenteComputadorVisitor {

    @Override
    public void visitar(CPU cpu) {
        System.out.println("Diagnosticando a CPU...");
        // Lógica de diagnóstico da CPU
    }

    @Override
    public void visitar(Memoria memoria) {
        System.out.println("Diagnosticando a memória...");
        // Lógica de diagnóstico da memória
    }

    @Override
    public void visitar(Disco disco) {
        System.out.println("Diagnosticando o disco...");
        // Lógica de diagnóstico do disco
    }
}