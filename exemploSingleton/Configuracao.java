// Singleton - Classe de Configuração do Sistema
class Configuracao {
    private static Configuracao instancia;
    private String configuracao;

    // Construtor privado impede instanciação direta
    private Configuracao() {
        this.configuracao = "Modo Padrão";
    }

    //Método estático para obter a única instância
    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }
}