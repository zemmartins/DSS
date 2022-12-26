public class Carro {
    private String marca;
    private String modelo;
    private int afinacao;
    private float pac;
    private float fiabilidade;
    private int cilindrada;
    private String pneus;
    private int potencia;

    public Carro(){
        this.marca = "";
        this.modelo = "";
        this.afinacao = 0;
        this.pac = 0;
        this.fiabilidade = 0;
        this.cilindrada = 0;
        this.pneus = "";
        this.potencia = 0;
    }

    public Carro(String marca, String modelo, int afinacao, float pac, float fiabilidade, int cilindrada, String pneus,int potencia){
        this.marca = marca;
        this.modelo = modelo;
        this.afinacao = afinacao;
        this.pac = pac;
        this.fiabilidade = fiabilidade;
        this.cilindrada = cilindrada;
        this.pneus = pneus;
        this.potencia = potencia;
    }

    public Carro(Carro c){
        this.marca = c.getMarca();
        this.modelo = c.getModelo();
        this.afinacao = c.getAfinacao();
        this.pac = c.getPAC();
        this.fiabilidade = c.getFiabilidade();
        this.cilindrada = c.getCilindrada();
        this.pneus = c.getPneus();
        this.potencia = c.getPotencia();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAfinacao() {
        return afinacao;
    }

    public void setAfinacao(int afinacao) {
        this.afinacao = afinacao;
    }

    public float getPAC() {
        return pac;
    }

    public void setPAC(float pac) {
        this.pac = pac;
    }

    public float getFiabilidade() {
        return fiabilidade;
    }

    public void setFiabilidade(float fiabilidade) {
        this.fiabilidade = fiabilidade;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getPneus() {
        return this.pneus;
    }

    public void setPneus(String pneus) {
        this.pneus = pneus;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int pot) {
        this.potencia = pot;
    }

    public float checkFia(){
        return this.fiabilidade;
    }

    public boolean checkC1(){
        if (this.modelo == "C1")
            return true;
        else return false;
    }

    public boolean checkC2(){
        if (this.modelo == "C2")
            return true;
        else return false;
    }

    public boolean checkGT(){
        if (this.modelo == "GT")
            return true;
        else return false;
    }

    public boolean checkSC(){
        if (this.modelo == "SC")
            return true;
        else return false;
    }


    public checkFia95(){}

    public checkFia80(){}

    //C1, C2, GT e SC vão ser extends??
}
