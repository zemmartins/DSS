package src.Circuitos;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;

public class Circuito{
    private String nome;
    private float distancia;
    private int voltas;
    private Map<Integer,Curva> curvas;
    private Map<Integer,Chicane> chicanes;
    private Map<Integer,Reta> retas;
    private int mapId;

    public Circuito(){
        this.nome = "";
        this.distancia = 0;
        this.voltas = 0;
        this.curvas = new HashMap<Integer,Curva>();
        this.chicanes = new HashMap<Integer,Chicane>();
        this.retas = new HashMap<Integer,Reta>();
        this.mapId = 0;
    }

    public Circuito(String nome,float distancia,int voltas,Map<Integer,Curva> curvas,Map<Integer,Chicane> chicanes,Map<Integer,Reta> retas,int mapId){
        this.nome = nome;
        this.distancia = distancia;
        this.voltas = voltas;
        this.curvas = curvas;
        this.chicanes = chicanes;
        this.retas = retas;
        this.mapId = mapId;
    }

    public Circuito(Circuito c){
        this.nome = c.nome;
        this.distancia = c.distancia;
        this.voltas = c.voltas;
        this.curvas = c.curvas;
        this.chicanes = c.chicanes;
        this.retas = c.retas;
        this.mapId = c.mapId;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setDistancia(float distancia){
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

    public void setCurvas(Map<Integer,Curva> curvas){
        this.curvas = curvas; 
    }

    public Map<Integer,Curva> getCurvas(){
        return this.curvas;
    }

    public void putCurva(Curva nova){
        this.mapId +=1;
        this.curvas.put(mapId,nova);
    }

    public void putCurva(float gdu,float comprimento){
        this.mapId +=1;
        Curva aux = new Curva(mapId,gdu,comprimento);
        this.curvas.put(mapId,aux);
    }

    public void setChicanes(Map<Integer,Chicane> chicanes){
        this.chicanes = chicanes;
    }

    public Map<Integer,Chicane> getChicanes(){
        return this.chicanes;
    }

    public void putChicane(Chicane nova){
        this.mapId +=1;
        this.chicanes.put(mapId,nova);
    }

    public void putChicane(float gdu,float comprimento){
        this.mapId +=1;
        Chicane aux = new Chicane(mapId,gdu,comprimento);
        this.chicanes.put(mapId,aux);
    }

    public void setRetas(Map<Integer,Reta> retas){
        this.retas = retas;
    }

    public Map<Integer,Reta> getRetas(){
        return this.retas;
    }

    public void putReta(Reta nova){
        this.mapId +=1;
        this.retas.put(mapId,nova);
    }

    public void putReta(float gdu,float comprimento){
        this.mapId +=1;
        Reta aux = new Reta(mapId,gdu,comprimento);
        this.retas.put(mapId,aux);
    }

    public ArrayList<Chicane> showListChicanes() {
        return new ArrayList<>(this.chicanes.values());
    }

    public ArrayList<Reta> showListStraight() {
        return new ArrayList<>(this.retas.values());
    }

    public ArrayList<Curva> showListCurves() {
        return new ArrayList<>(this.curvas.values());
    }

    public float checkGDUreta(int idReta){
        return this.retas.get(idReta).getGdu();
    }

    public float checkGDUcurva(int idCurva){
        return this.curvas.get(idCurva).getGdu();
    }

    public float checkGDUchicane(int idChicane){
        return this.chicanes.get(idChicane).getGdu();
    }

    // regChicane(idCircuito : string, GDU : float, comprimento : float) : void

    // egCurve(idCircuito : string, GDU : float, comprimento : float) : void

    /*public int calcNumberStraight(Circuito c){
        int cur = c.curvas.size();
        int chi = c.chicanes.size();
    }*/

    //public int calcNumberStraight(){}

    public float totalCurvas(){
        float res = 0;
        for(Map.Entry<Integer, Curva> pair : this.curvas.entrySet()){
            res += pair.getValue().getComprimeto();
        }
        return res;
    }

    public float totalChicanes(){
        float res = 0;
        for(Map.Entry<Integer, Chicane> pair : this.chicanes.entrySet()){
            res += pair.getValue().getComprimeto();
        }
        return res;
    }
}