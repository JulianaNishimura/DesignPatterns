// ConcreteCommand - Comando de desligar a TV
class DesligarTV implements Comando {
    private TV tv;

    public DesligarTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        tv.desligar();
    }
}