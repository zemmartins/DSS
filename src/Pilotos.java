import java.util.Map;
import java.util.HashMap;

public class Pilotos {
    private Map<String, Piloto> pilotos;

    public Pilotos(){
        this.pilotos = new HashMap<>();
    }

    public Pilotos(HashMap<String, Piloto> p){
        this.pilotos = p;
    }

    public boolean isAvailable(String pName) throws Exception{
        if(pilotos.get(pName) != null){
            return pilotos.get(pName).getAvailable();
        }
        else{
            throw new Exception("Piloto Inexistente");
        }
    }

    public void changeStatus(String pName) throws Exception{
        if(pilotos.get(pName) != null){
            Piloto p = new Piloto(pilotos.get(pName));
            p.setAvailable(!p.getAvailable());
            pilotos.replace(pName, p);
        }
        else{
            throw new Exception("Piloto Inexistente");
        }
    }

    public void addPilot(float CTS, float SVA, boolean available, String nome) throws Exception{
        if(pilotos.get(nome) != null){
            throw new Exception("Piloto ja existente");
        }
        else{
            pilotos.put(nome, new Piloto(CTS, SVA, available, nome));
        }
    }
}
