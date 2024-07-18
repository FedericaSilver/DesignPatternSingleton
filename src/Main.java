/*
Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
Creare 2 oggetti User di cui creerà un'istanza.
Del primo si stamperanno le informazioni di default,
del secondo si cambieranno le informazioni e poi si stamperanno a video
 */
public class Main {
    public static void main(String[] args) {
    User user = User.getInstance();
    user.stampaInfo();
    user.setNome("Luigia");
    user.setEta(11);
    user.stampaInfo();
    User user1 = User.getInstance();
    user1.setNome("Mario");
    user1.setEta(18);
    user1.stampaInfo();

    }
}