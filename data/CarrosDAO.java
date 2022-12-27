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
             ResultSet rs = stm.executeQuery("SELECT count(*) FROM carro")) {
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
        return this.size()==0;
    }

    @Override
    public boolean containsKey(Object key) {
        boolean r;
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement();
             ResultSet rs =
                     stm.executeQuery("SELECT Id FROM carro WHERE Id='"+key.toString()+"'")) {
            r = rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return r;
    }

    @Override
    public boolean containsValue(Object value) {
        Carro c = (Carro) value;
        return this.containsKey(c.getMarca());
    }

    @Override
    public Carro get(Object key) {
        Carro c = null;
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT * FROM carro WHERE Id='"+key+"'")) {
            if (rs.next()) {  // A chave existe na tabela
                // Reconstruir a colecção de carross
                c = new Carro(rs.getInt("ID"),rs.getString("MARCA"),rs.getString("MODELO"),rs.getFloat("PAC"),rs.getFloat("FIABILIDADE"),rs.getInt("CILINDRADA"),rs.getString("PNEUS"),rs.getInt("POTENCIA"),rs.getBoolean("HIBRIDO"));
            }
        } catch (SQLException e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return c;
    }

    @Override
    public Carro put(String key, Carro value) {
        Carro c = null;
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement()) {

            stm.executeUpdate("INSERT INTO carro VALUES ('"+value.getID()+"', '"+value.getMarca()+"', '"+value.getModelo()+"','"+value.getPAC()+"','"+value.getFiabilidade()+"','"+value.getCilindrada()+"','"+value.getPneus()+"','"+value.getPotencia()+"','"+value.getHibrido()+"')");

        } catch (SQLException e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return c;
    }

    @Override
    public Carro remove(Object key) {
        Carro c = this.get(key);
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement()) {
                stm.executeUpdate("DELETE FROM carro WHERE NOME='" + key + "'");
    } catch (Exception e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return c;
    }

    @Override
    //nao sei se esta certo pois marca não é um valor unico tipo id
    public void putAll(Map<? extends String, ? extends Carro> m) {
        for(Carro c : m.values()) {
            this.put(c.getMarca(), c);
        }
    }

    @Override
    public void clear() {
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
            Statement stm = conn.createStatement()) {
                stm.executeUpdate("TRUNCATE carro");
        } catch (SQLException e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
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