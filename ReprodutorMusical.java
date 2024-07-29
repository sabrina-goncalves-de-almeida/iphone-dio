import java.util.List;
import java.util.ArrayList;

public class ReprodutorMusical {

    private Musica musicaAtual;
    private List<Musica> musicas = new ArrayList<Musica>();

    void tocar(){
        System.out.println("tocando");
    }
    void pausar(){
        System.out.println("pausado");
    }
    void selecionarMusica(String musica){
        for (Musica m : musicas) {
            if(m.getTitulo().equals(musica)){
                musicaAtual = m;
            }
        }
    }
}
