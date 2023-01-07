package src.UI;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import src.RMFacade;

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
        return res;
    }

    public static ArrayList<String> menuRegisto()
    {
        clearWindow();
        ArrayList res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------MENU REGISTO-----------\n\n");
        System.out.println("\tNome Utilizador\n"); 
        res.add(sc.nextLine());
        System.out.println("\tPassword\n"); 
        res.add(sc.nextLine());
        return res;
    }


    public static int menuPrincipal_normal() {
        clearWindow();
        StringBuilder sb = new StringBuilder("-----------MENU INICIAL-----------\n\n");
        sb.append("\tSelecione a opção pretendida com base na sua preferência.\n"); 
        sb.append("\t(1) - Jogar\n");
        sb.append("\t(2) - Sair\n"); 
        sb.append("\tSelecione a opção pretendida: ");
        System.out.println(sb.toString());
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int menu_Jogar() {
        clearWindow();
        StringBuilder sb = new StringBuilder("-----------MENU JOGAR-----------\n\n");
        sb.append("\tSelecione a opção pretendida com base na sua preferência.\n"); 
        sb.append("\t(1) - Escolher carro\n");
        sb.append("\t(2) - Escolher campeonato\n");
        sb.append("\t(3) - Escolher piloto\n");
        sb.append("\tSelecione a opção pretendida: ");
        System.out.println(sb.toString());
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int menuEscolherCarro() {
        clearWindow();
        //Lista dos carros
        System.out.println("\tSelecione a opção pretendida: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int menuEscolherCampeonato() {
        clearWindow();
        //Lista dos campeonatos
        System.out.println("\tSelecione a opção pretendida: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int menuEscolherPiloto() {
        clearWindow();
        //Lista dos pilotos
        System.out.println("\tSelecione a opção pretendida: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int menuPrincipal_admin() {
        clearWindow();
        StringBuilder sb = new StringBuilder("-----------MENU INICIAL-----------\n\n");
        sb.append("\tSelecione a opção pretendida com base na sua preferência.\n"); 
        sb.append("\t(1) - Criar Carro\n"); 
        sb.append("\t(2) - Criar Piloto\n");
        sb.append("\t(3) - Criar Circuito\n");
        sb.append("\t(4) - Criar Campeonato\n"); 
        sb.append("\t(5) - Jogar\n");
        sb.append("\tSelecione a opção pretendida: ");
        System.out.println(sb.toString());
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static ArrayList<Integer> menuCriaCarroAdmin() {
        clearWindow();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> criaCarro_termos = new ArrayList<>();

        System.out.println("-----------MENU CRIA CARRO-----------\n\n");
        System.out.println("Introduza os dados a seguir pedidos.\n\n"); 
        System.out.println("Insira a classe do carro:\n(1) - C1\n(2) - C2\n(3) - GT\n(4) - SC\n");
        int classe = scanner.nextInt();
        criaCarro_termos.add(classe);
        System.out.println("Insira a marca do carro:\n");
        String marca = scanner.nextLine();
        criaCarro_termos.add(marca);
        System.out.println("Insira o modelo do carro:\n");
        int modelo = scanner.nextInt();
        criaCarro_termos.add(classe);
        System.out.println("Insira o PAC:\n");
        System.out.println("Insira a fiabilidade:\n");
        System.out.println("Insira a cilindrada:\n");
        System.out.println("Insira a potência:\n");
        System.out.println("Insira o tipo de pneus:\n");
        System.out.println("hibrido");

        int classe = scanner.nextInt();
        String marca = scanner.nextLine();
        criaCarro_termos.add(classe);

        return criaCarro_termos;
    }

    public static boolean isHibrido(){
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");
        sb.append("Introduza os dados a seguir pedidos.\n\n");
        sb.append("Carro é híbrido? True/False.\n\n");
        System.out.println(sb.toString());
        Scanner sc = new Scanner(System.in);
        return sc.nextBoolean(); //Maneira mais facil bro, caga nisto 
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