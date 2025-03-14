// Visitor - Interface que define a operação de visita para cada tipo de elemento
interface ComponenteComputadorVisitor {
    void visitar(CPU cpu);
    void visitar(Memoria memoria);
    void visitar(Disco disco);
}