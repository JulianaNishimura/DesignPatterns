class Facade {
    private TV tv;
    private DVDPlayer dvd;
    private Som som;

    public Facade(TV tv, DVDPlayer dvd, Som som) {
        this.tv = tv;
        this.dvd = dvd;
        this.som = som;
    }

    public void assistirFilme(String filme) {
        System.out.println("\nPreparando para assistir ao filme...");
        tv.ligar();
        dvd.ligar();
        som.ligar();
        som.ajustarVolume(10);
        dvd.reproduzirFilme(filme);
        System.out.println("Filme iniciado! 🍿🎬");
    }

    public void desligarSistema() {
        System.out.println("\nDesligando o sistema...");
        dvd.desligar();
        tv.desligar();
        som.desligar();
        System.out.println("Sistema desligado.");
    }
}