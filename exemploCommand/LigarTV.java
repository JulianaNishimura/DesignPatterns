// ConcreteCommand - Comando de ligar a TV
class LigarTV implements Comando {
    private TV tv;

    public LigarTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        tv.ligar();
    }
}
