package data;

import java.sql.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.w3c.dom.views.AbstractView;

import static java.util.stream.Collectors.toList;

import static java.util.stream.Collectors.*;

import src.Carro;


/**
 * CarrosDAO
 */

public class CarrosDAO implements Map<String,Carro> {
    private static CarrosDAO singleton = null;

    private CarrosDAO() throws SQLException{
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS carro (" +
                    "ID INT NOT NULL PRIMARY KEY," +
                    "MARCA VARCHAR(25) NOT NULL," +
                    "MODELO VARCHAR(25) NOT NULL," +
                    "PAC FLOAT(3) NOT NULL" +
                    "FIABILIDADE FLOAT(3) NOT NULL" +
                    "CILINDRADA INT NOT NULL" +
                    "PNEUS VARCHAR(25) NOT NULL" +
                    "POTENCIA INT NOT NULL" +
                    "HIBRIDO BOOL NOT NULL)";
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
    }

    public static CarrosDAO getInstance() throws SQLException {
        if (CarrosDAO.singleton == null) {
            CarrosDAO.singleton = new CarrosDAO();
        }
        return CarrosDAO.singleton;
    }

    @Override
    public int size() {
        int i=0;
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT count(*) FROM carros")) {
            if(rs.next()) {
                i = rs.getInt(1);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Carro get(Object key) {
        return null;
    }

    @Override
    public Carro put(String key, Carro value) {
        return null;
    }

    @Override
    public Carro remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends String, ? extends Carro> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<String> keySet() {
        return null;
    }

    @Override
    public Collection<Carro> values() {
        return null;
    }

    @Override
    public Set<Entry<String, Carro>> entrySet() {
        return null;
    }

}