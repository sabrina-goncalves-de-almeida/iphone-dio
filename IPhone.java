public class IPhone{
    protected ReprodutorMusical reprodutor;
    protected AparelhoTelefonico telefone;
    private NavegadorInternet navegador;


    public AparelhoTelefonico getTelefone() {
        return telefone;
    }
    public void setTelefone(AparelhoTelefonico telefone) {
        this.telefone = telefone;
    }

    public NavegadorInternet getNavegador() {
        return navegador;
    }
    public void setNavegador(NavegadorInternet navegador) {
        this.navegador = navegador;
    }
    public ReprodutorMusical getReprodutor() {
        return reprodutor;
    }
    public void setReprodutor(ReprodutorMusical reprodutor) {
        this.reprodutor = reprodutor;
    }
}