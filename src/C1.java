import java.util.Map;
import java.util.Random;

public class C1 extends Carro{

    public C1(){
        super();
    }

	public C1(String marca,String modelo,int afinacao,Float pac,Float fiabilidade,int cilindrada,String pneus,int eletrico){
        super(marca, modelo, afinacao,pac,fiabilidade,cilindrada,pneus);
    }

    public C1(C1 p){
        super(p);
    }

    @Override
    public C1 clone(){
        return new C1(this);
    }

    public boolean equals(Object o)
    {
        if(this==o)
        return true;
        
        if(o==null || this.getClass()!=o.getClass())
        return false;
        
        C1 c = (C1) o;
        return ( super.equals(c));
    }
}