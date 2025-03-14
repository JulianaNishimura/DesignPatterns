// ConcreteCommand - Comando de aumentar o volume da TV
class Volume implements Comando {
    private TV tv;

    public Volume(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        tv.aumentarVolume();
    }
}