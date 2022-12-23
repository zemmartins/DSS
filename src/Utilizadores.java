import java.util.HashMap;
import java.util.Objects;

public class Utilizadores {
    private HashMap<String, Utilizador> users;

    public Utilizadores(){
        this.users = new HashMap<>();
    }

    public boolean checkUsername(String nomeUtilizador){
        return this.users.get(nomeUtilizador) != null;
    }

    public boolean checkPassword(String nomeUtilizador, String pass) throws Exception{
        if(checkUsername(nomeUtilizador)){
            return Objects.equals(this.users.get(nomeUtilizador).getPassword(), pass);
        }
        else{
            throw new Exception("Utilizador não existente");
        }
    }

    public boolean isPremium(String userID) throws Exception{
        if(checkUsername(userID)){
            return Objects.equals(this.users.get(userID).getTipoDeUser(), 'p');
        }
        else{
            throw new Exception("Utilizador não existente");
        }
    }

    public void regUser(String name, String pass, char tipo) throws Exception {
        if(!checkUsername(name)){
            Utilizador u = new Utilizador(name, pass, tipo);
            this.users.put(name, u);
        }
        else{
            throw new Exception("Utilizador já existente");
        }
    }
}

