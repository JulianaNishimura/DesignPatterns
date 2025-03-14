public class Main {
    //Cliente
    public static void main(String[] args) {
        Plug2Pinos plug2Pinos = new Plug2Pinos();
        Tomada3Pinos adaptador = new PlugAdapter(plug2Pinos);

        // Conectando um plug de 2 pinos em uma tomada de 3 pinos usando o adaptador
        adaptador.conectarNaTomadaDe3Pinos();
    }
}