// Subject - Interface para o sujeito
interface Sujeito {
    void adicionarObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarObservadores();
}