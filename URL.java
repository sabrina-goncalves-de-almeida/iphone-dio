public class URL {

    private String link;

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void chamarURL(){
        System.out.println(String.format("chamar URL: %s",this.link));
    }
    
}
