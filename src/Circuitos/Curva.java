package src.Circuitos;

public class Curva{
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