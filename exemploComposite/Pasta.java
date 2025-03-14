import java.util.ArrayList;
import java.util.List;

class Pasta implements ArquivoSistema {
    //composto - pode conter arquivos e outras pastas
    private String nome;
    private List<ArquivoSistema> elementos = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(ArquivoSistema elemento) {
        elementos.add(elemento);
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "[Pasta] " + nome);
        for (ArquivoSistema elemento : elementos) {
            elemento.exibir(indentacao + "  ");
        }
    }
}