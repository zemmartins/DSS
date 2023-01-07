package src.Controller;

import src.RMFacade;
import src.UI.UI;

import java.util.ArrayList;

public class Controller_Login {
    public static void run(RMFacade rmFacade)
    {
        boolean exit = false;
        while (true)
        {
            ArrayList<String> opcao = -1;
            while (opcao < 0 || opcao > 6)
            {
                opcao = UI.menuLogin(); 
                switch (opcao)
                {
                    case 0:
                    {
                        System.exit(0);
                        break;
                    }
                }
            }

        }
    }
}
