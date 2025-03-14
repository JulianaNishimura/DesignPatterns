public class Main {
    public static void main(String[] args) {

        DocumentoRelatorio relatorioOriginal = new DocumentoRelatorio("Relatório Padrão", "Conteúdo");

        Documento relatorioClone = relatorioOriginal.clonar();
        ((DocumentoRelatorio) relatorioClone).setTitulo("Relatório de Vendas");
        ((DocumentoRelatorio) relatorioClone).setConteudo("Conteúdo do relatório de vendas.");

//        ou fazer o casting assim:
//        DocumentoRelatorio relatorioClonado = (DocumentoRelatorio) relatorioOriginal.clonar();
//        relatorioClonado.setTitulo("Relatório de Vendas");
//        relatorioClonado.setConteudo("Conteúdo do relatório de vendas.");

        System.out.println("Relatório Original:");
        relatorioOriginal.exibirInformacoes();

        System.out.println("-----");

        System.out.println("Relatório Clonado:");
        relatorioClone.exibirInformacoes();
    }
}
