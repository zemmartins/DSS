package src;

import java.util.Collection;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.sql.*;

import data.*;


public class RMFacade {

    public Map<String, Piloto> pilotos;
    public Map<String, Carro> carros;
    public Map<String, Circuito> circuitos;
    public Utilizadores utilizadores; //Map<String,utilizadores>

    public RMFacade() throws SQLException {
        this.pilotos = PilotosDAO.getInstance();
        this.carros = CarrosDAO.getInstance();
        this.circuitos = CircuitosDAO.getInstance();
        this.utilizadores = new Utilizadores();
    }


}
