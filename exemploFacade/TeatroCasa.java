public class TeatroCasa {
    //Cliente
    public static void main(String[] args) {
        TV tv = new TV();
        DVDPlayer dvd = new DVDPlayer();
        Som som = new Som();

        Facade teatroCasa = new Facade(tv, dvd, som);

        // Cliente usa a fachada para simplificar o controle
        teatroCasa.assistirFilme("O Poderoso Chefão");
        teatroCasa.desligarSistema();
    }
}