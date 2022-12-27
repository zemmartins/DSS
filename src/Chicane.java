package src;

public class Chicane{
        private float gdu;
        private float comprimento;
        private int idChicanes;

        public Chicane(){
            this.gdu = 0;
            this.comprimento = 0;
            this.idChicanes = 0;
        }

        public Chicane(int idChicanes,float gdu,float comprimento){
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