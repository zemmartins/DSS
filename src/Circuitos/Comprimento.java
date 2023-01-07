package src.Circuitos;

public class Comprimento{
        //private String circID;
        private float gdu;
        //private int id;
        private int tipo; // 1 para reta, 2 para curva, 3 para chicane

        public Comprimento(){
            //this.circID = "";
            this.gdu = 0;
            //this.id = 0;
            this.tipo = 0;
        }

        public Comprimento(/*String cID,int id,*/float gdu,int tipo){
            //this.circID = cID;
            this.gdu = gdu;
            //this.id = id;
            this.tipo = tipo;
        }

        public Comprimento(Comprimento c){
            //this.circID = c.getCircID();
            this.gdu = c.getGdu();
            //this.id = c.getId();
            this.tipo = c.getTipo();
        }

        /*public void setCircID(String cID){
            this.circID = cID;
        }

        public String getCircID() {
            return this.circID;
        }*/

        public void setGDU(float gdu){
            this.gdu = gdu;
        }

        public float getGdu(){
            return this.gdu;
        }

        /*public void setId(int id){
            this.id = id;
        }

        public int getId(){
            return this.id;
        }*/

        public void setTipo(int tipo){
            this.tipo = tipo;
        }

        public int getTipo(){
            return this.tipo;
        }
    }