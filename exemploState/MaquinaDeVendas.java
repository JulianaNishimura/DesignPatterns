// Context - A máquina de vendas (o contexto que tem o estado atual)
class MaquinaDeVendas {
    private EstadoDaMaquina estadoAtual;

    public MaquinaDeVendas() {
        this.estadoAtual = new AguardandoPagamento();  // Estado inicial
    }

    public void setEstado(EstadoDaMaquina estado) {
        this.estadoAtual = estado;
    }

    public void realizarAcao() {
        estadoAtual.realizarAcao(this);
    }
}