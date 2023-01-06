package src.Circuitos;

public class Reta{
        private float gdu;
        private float comprimento;
        private int idRetas;

        public Reta(){
            this.gdu = 0;
            this.comprimento = 0;
            this.idRetas = 0;
        }

        public Reta(int idRetas,float gdu,float comprimento){
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