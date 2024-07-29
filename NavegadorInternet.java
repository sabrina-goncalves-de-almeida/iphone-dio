import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    private URL linkAtual;
    private List<URL> linksAbertos = new ArrayList<>();

    void exibirPagina(String url){
        linkAtual.chamarURL();
        System.out.println("exibindo pagina");
    }

    void adicionarNovaAba(URL url){
        linksAbertos.add(url);
        exibirPagina(url.getLink());
    }
    void atualizarPagina(){
        linkAtual.chamarURL();
        System.out.println("atualizado");
    }
    
}
