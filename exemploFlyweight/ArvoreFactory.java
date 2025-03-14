import java.util.HashMap;
import java.util.Map;

// Flyweight Factory - Gerencia objetos compartilhados
class ArvoreFactory {
    private static Map<String, ArvoreTipo> tipos = new HashMap<>();

    public static ArvoreTipo getArvoreTipo(String nome, String cor, String textura) {
        String chave = nome + "-" + cor + "-" + textura;
        if (!tipos.containsKey(chave)) {
            tipos.put(chave, new ArvoreTipo(nome, cor, textura));
            System.out.println("Criando novo tipo de árvore: " + chave);
        }
        return tipos.get(chave);
    }
}