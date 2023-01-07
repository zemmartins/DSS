package src.Circuitos;

import java.util.Map;
//import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Collection;

public class Circuito{
    private String nome;
    private int distancia;
    private int voltas;
    private Map<Integer,Comprimento> comprimento;
    private int mapId;

    public Circuito(){
        this.nome = "";
        this.distancia = 0;
        this.voltas = 0;
        this.comprimento = new HashMap<Integer,Comprimento>();
        this.mapId = 0;
    }

    public Circuito(String nome,int distancia,int voltas,/*String elementos,*/int mapId){
        this.nome = nome;
        this.distancia = distancia;
        this.voltas = voltas;
        /*this.comprimento = comprimento;*/
        this.mapId = mapId;
    }

    public Circuito(Circuito c){
        this.nome = c.nome;
        this.distancia = c.distancia;
        this.voltas = c.voltas;
        this.comprimento = c.comprimento;
        this.mapId = c.mapId;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setDistancia(int distancia){
        this.distancia = distancia;
    }

    public float getDistancia(){
        return this.distancia;
    }

    public void setVoltas(int voltas){
        this.voltas = voltas;
    }

    public int getVoltas(){
        return this.voltas;
    }

    public void setComprimento(Map<Integer,Comprimento> comprimento){
        this.comprimento = comprimento;
    }

    public Map<Integer,Comprimento> getComprimento(){
        return this.comprimento;
    }

    public void setMapID(int mid){
        this.mapId = mid;
    }

    public int getMapID(){
        return this.mapId;
    }

    public Map<Integer,Comprimento> comprimentoStringToMap(String elements){
        int count = 0;
        for(String e : elements.split(" ")){
            for(String a : e.split(",")){
                if()
            }
        }
    }
  

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    public ArrayList<Comprimento> showListChicanes() {
        ArrayList<Comprimento> nova = new ArrayList<Comprimento>();
        
        for(Map.Entry<Integer, Comprimento> pair : this.comprimento.entrySet()){
            if(pair.getValue().getTipo()==3){
                nova.add(pair.getValue());

            }
        }
        return nova;
    }

    public ArrayList<Comprimento> showListStraight() {
        ArrayList<Comprimento> nova = new ArrayList<Comprimento>();
        
        for(Map.Entry<Integer, Comprimento> pair : this.comprimento.entrySet()){
            if(pair.getValue().getTipo()==1){
                nova.add(pair.getValue());

            }
        }
        return nova;
    }

    public ArrayList<Comprimento> showListCurves() {
        ArrayList<Comprimento> nova = new ArrayList<Comprimento>();

        for(Map.Entry<Integer, Comprimento> pair : this.comprimento.entrySet()){
            if(pair.getValue().getTipo()==2){
                nova.add(pair.getValue());

            }
        }
        return nova;
    }

    public float checkGDUreta(int idReta){
        return this.comprimento.get(idReta).getGdu();
    }

    public float checkGDUcurva(int idCurva){
        return this.comprimento.get(idCurva).getGdu();
    }

    public float checkGDUchicane(int idChicane){
        return this.comprimento.get(idChicane).getGdu();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    

    public void regChicane(String idCircuito ,float gdu){
        Comprimento aux = new Comprimento(idCircuito,mapId,gdu,3);
        this.comprimento.put(mapId,aux);
        this.mapId +=1;
    }

    public void regCurva(String idCircuito ,float gdu){
        Comprimento aux = new Comprimento(idCircuito,mapId,gdu,2);
        this.comprimento.put(mapId,aux);
        this.mapId +=1;
    }

    public void regStraight(String idCircuito ,float gdu){
        Comprimento aux = new Comprimento(idCircuito,mapId,gdu,1);
        this.comprimento.put(mapId,aux);
        this.mapId +=1;
    }

    public void putComprimento(Comprimento nova){
        
        this.comprimento.put(mapId,nova);
        this.mapId +=1;
    }

    public int calcNumberStraight(Circuito c){
        int cur = c.totalCurvas();
        int chi = c.totalChicanes();

        int comp = c.distancia - cur*100 - chi * 100;
        return (comp/100);
    }

    public int calcNumberStraight(){
        int cur = this.totalCurvas();
        int chi = this.totalChicanes();

        int comp = this.distancia - cur*100 - chi * 100;
        return (comp/100);
    }

    public int totalCurvas(){
        int r = 0;
        for(Map.Entry<Integer, Comprimento> pair : this.comprimento.entrySet()){
            if(pair.getValue().getTipo()==2)
                r+=1;            
        }

        return r;
    }

    public int totalChicanes(){
        int r = 0;
        for(Map.Entry<Integer, Comprimento> pair : this.comprimento.entrySet()){
            if(pair.getValue().getTipo()==3)
                r+=1;            
        }

        return r;
    }
}