package src.UI;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//import src.Utilizadores.Utilizador;

public class UI
{
    public static int menuInicial()
    {
        clearWindow();
        StringBuilder sb = new StringBuilder("-----------MENU INICIAL-----------\n\n");
        sb.append("\tBem vindo ao F1Manager, por favor efetue o login ou o registo.\n"); 
        sb.append("\t(1) - Registo\n"); 
        sb.append("\t(2) - Login\n"); 
        sb.append("\tSelecione a opção pretendida: ");
        System.out.println(sb.toString());
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static ArrayList<String> menuLogin()
    {
        clearWindow();
        ArrayList res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------MENU LOGIN-----------\n\n");
        System.out.println("\tNome Utilizador\n"); 
        res.add(sc.nextLine());
        System.out.println("\tPassword\n"); 
        res.add(sc.nextLine());
        System.out.println("\tSelecione a opção pretendida: ");
        return res;
    }

    public static String pressEnter()
    {
        System.out.println("Pressione qualquer tecla para continuar...");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void clearWindow()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println();
        }
    }



    public static void main(String [] a) {
        menuInicial();
    }

}