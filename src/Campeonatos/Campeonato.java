package src.Campeonatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import src.Circuitos.Circuito;

public class Campeonato{
    private String nome;
    private Map<String,Circuito> circuitos;

    public Campeonato(){
        this.nome = "";
        this.circuitos = new HashMap<String,Circuito>();
    }

    public Campeonato(Campeonato c){
        this.nome = c.nome;
        this.circuitos = c.circuitos;
    }

    public Campeonato(String nome,HashMap<String,Circuito> circuitos){
        this.nome = nome;
        this.circuitos = circuitos;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Map<String,Circuito> getCircuitos(){
        return this.circuitos;
    }

    public void setCircuitos(HashMap<String,Circuito> circuitos){
        this.circuitos = circuitos;
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void regNomeCampeonato(String nome){
        this.setNome(nome);
    }

    //public boolean checkNomeCampeonato(String nome){} // função é fora do campeonato

    public void placeCampeonato(Circuito c){
        String n = c.getNome();
        this.circuitos.put(n, c);
    }

    public ArrayList<Circuito> showCircuitos(){
        ArrayList<Circuito> nova = new ArrayList<Circuito>();

        for(Map.Entry<String, Circuito> pair : this.circuitos.entrySet()){
            nova.add(pair.getValue());       
        }
        return nova;
    }
}