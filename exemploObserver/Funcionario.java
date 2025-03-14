// ConcreteObserver - Implementação do observador (Funcionário)
class Funcionario implements Observador {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu a mensagem: " + mensagem);
    }
}