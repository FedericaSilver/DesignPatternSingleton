public class User {

    private String nome;
    private int eta;
    private static User istanza;

    private User(){};

    public static User getInstance(){
        if(istanza == null){
            istanza = new User();
        } return istanza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }


    public void stampaInfo() {
        System.out.println("User: " + getNome() + " età: " + getEta());
    }
}
