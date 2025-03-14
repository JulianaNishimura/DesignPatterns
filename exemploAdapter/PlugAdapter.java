class PlugAdapter implements Tomada3Pinos {
    //adapter - traduz a interface
    private Plug2Pinos plug2Pinos;

    public PlugAdapter(Plug2Pinos plug2Pinos) {
        this.plug2Pinos = plug2Pinos;
    }

    @Override
    public void conectarNaTomadaDe3Pinos() {
        System.out.println("Adaptador em uso...");
        plug2Pinos.conectarNaTomadaDe2Pinos();
    }
}