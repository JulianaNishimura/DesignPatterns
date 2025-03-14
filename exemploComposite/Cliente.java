public class Cliente {
    public static void main(String[] args) {
        //Cliente
        // Criando arquivos
        Arquivo arquivo1 = new Arquivo("documento.txt");
        Arquivo arquivo2 = new Arquivo("foto.jpg");
        Arquivo arquivo3 = new Arquivo("planilha.xlsx");

        // Criando pastas
        Pasta pastaRaiz = new Pasta("Meus Documentos");
        Pasta subPasta = new Pasta("Fotos");

        pastaRaiz.adicionar(arquivo1);
        pastaRaiz.adicionar(arquivo3);
        subPasta.adicionar(arquivo2);
        pastaRaiz.adicionar(subPasta);

        pastaRaiz.exibir("");
    }
}