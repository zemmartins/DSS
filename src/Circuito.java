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

    class Curva{
        private float gdu;
        private float comprimento;
        private int idCurvas;

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

    public void setCurvas(Curva curva){
        this.curvas.put(idcurva, curva); //id e a curva
    }

    public Map<Integer,Curva> getCurvas(){
        return this.curvas;
    }

    public void setChicanes(Map<Integer,Chicane> chicanes){
        this.chicanes = chicanes;
    }

    public Map<Integer,Chicane> getChicanes(){
        return this.chicanes;
    }

    public void setRetas(Map<Integer,Reta> retas){
        this.retas = retas;
    }

    public Map<Integer,Reta> getRetas(){
        return this.retas;
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
}