package src.Controller;

import java.util.ArrayList;

import src.RMFacade;
import src.Carros.C1;
import src.Carros.C2;
import src.Carros.SC;
import src.Carros.GT;
import src.Carros.Carro;
import src.UI.UI;
import src.Utilizadores.Utilizador;

public class Controller_CriaCarro {
    public static void run(RMFacade rm) throws Exception{
        boolean exit = false;
        Carro carro = new Carro();
        Integer id = rm.carros.size()+1;
        while(!exit){ 
            ArrayList<String> option = UI.menuCriaCarroAdmin();
            if(Integer.parseInt(option.get(0))==1) {  
                C1 c1 = new C1(id, option.get(2), option.get(2), option.get(3), option.get(4), option.get(5), option.get(6), option.get(7), hibrido);
            }
            else if(option.get(0)==2) {  
                C2 c2 = new C2(id, option.get(2), option.get(2), option.get(3), option.get(4), option.get(5), option.get(6), option.get(7), hibrido);
            } 
            else if(option.get(0)==3) {  
                GT gt = new GT(id, option.get(2), option.get(2), option.get(3), option.get(4), option.get(5), option.get(6), option.get(7), hibrido);
            } 
            else if(option.get(0)==4) { 
                option.get(1) ->  "String"
                SC c2 = new SC(id,option.get(1),option.get(2), option.get(3), option.get(4), option.get(5), option.get(6), option.get(7), false);
            } 
                
        }
    }
            
}

