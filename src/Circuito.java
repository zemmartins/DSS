package src;

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

    class Curva{
        private float gdu;
        private float comprimento;
        private int idCurvas;

        public Curva(){
            this.gdu = 0;
            this.comprimento = 0;
            this.idCurvas = 0;
        }

        public Curva(int idCurvas, float gdu,float comprimento){
            this.gdu = gdu;
            this.comprimento = comprimento;
            this.idCurvas = idCurvas;
        }

        public Curva(Curva c){
            this.gdu = c.gdu;
            this.comprimento = c.comprimento;
            this.idCurvas = c.idCurvas;
        }

        public void setGDU(float gdu){
            this.gdu = gdu;
        }

        public float getGdu(){
            return this.gdu;
        }

        public void setComprimento(float comprimento){
            this.comprimento = comprimento;
        }

        public float getComprimeto(){
            return this.comprimento;
        }

        public void setIdCurvas(int idCurvas){
            this.idCurvas = idCurvas;
        }

        public int getIdCurvas(){
            return this.idCurvas;
        }
    }

    class Chicane{
        private float gdu;
        private float comprimento;
        private int idChicanes;

        public Chicane(){
            this.gdu = 0;
            this.comprimento = 0;
            this.idChicanes = 0;
        }

        public Chicane(float gdu,float comprimento,int idChicanes){
            this.gdu = gdu;
            this.comprimento = comprimento;
            this.idChicanes = idChicanes;
        }

        public Chicane(Chicane c){
            this.gdu = c.gdu;
            this.comprimento = c.comprimento;
            this.idChicanes = c.idChicanes;
        }

        public void setGDU(float gdu){
            this.gdu = gdu;
        }

        public float getGdu(){
            return this.gdu;
        }

        public void setComprimento(float comprimento){
            this.comprimento = comprimento;
        }

        public float getComprimeto(){
            return this.comprimento;
        }

        public void setIdChicanes(int idChicanes){
            this.idChicanes = idChicanes;
        }

        public int getIdChicanes(){
            return this.idChicanes;
        }
    }

    class Reta{
        private float gdu;
        private float comprimento;
        private int idRetas;

        public Reta(){
            this.gdu = 0;
            this.comprimento = 0;
            this.idRetas = 0;
        }

        public Reta(float gdu,float comprimento,int idRetas){
            this.gdu = gdu;
            this.comprimento = comprimento;
            this.idRetas = idRetas;
        }

        public Reta(Reta c){
            this.gdu = c.gdu;
            this.comprimento = c.comprimento;
            this.idRetas = c.idRetas;
        }

        public void setGDU(float gdu){
            this.gdu = gdu;
        }

        public float getGdu(){
            return this.gdu;
        }

        public void setComprimento(float comprimento){
            this.comprimento = comprimento;
        }

        public float getComprimeto(){
            return this.comprimento;
        }

        public void setIdRetas(int idRetas){
            this.idRetas = idRetas;
        }

        public int getIdRetas(){
            return this.idRetas;
        }
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
        Curva aux = new Curva(gdu,comprimento,mapId);
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
        Chicane aux = new Chicane(gdu,comprimento,mapId);
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
        Reta aux = new Reta(gdu,comprimento,mapId);
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