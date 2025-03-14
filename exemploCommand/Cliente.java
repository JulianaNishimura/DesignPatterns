public class Cliente {
    public static void main(String[] args) {
        TV tv = new TV();

        // Criando os comandos
        Comando ligar = new LigarTV(tv);
        Comando desligar = new DesligarTV(tv);
        Comando aumentarVolume = new Volume(tv);

        // Criando o controle remoto
        ControleRemoto controle = new ControleRemoto();

        // Controlando a TV
        controle.setComando(ligar);
        controle.pressionarBotao(); // Liga a TV

        controle.setComando(aumentarVolume);
        controle.pressionarBotao(); // Aumenta o volume

        controle.setComando(desligar);
        controle.pressionarBotao(); // Desliga a TV
    }
}
