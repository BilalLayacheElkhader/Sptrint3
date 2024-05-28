package Tasca1.Nivel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    static Scanner sc = new Scanner(System.in);
    private static Application configureApplication(){
            Application app;
            GUIFactory guiFactory;
            ArrayList<String> note;
            System.out.println("INTRODUCE EL PAIS EN EL QUE VIVES:");
            String country = sc.nextLine().toLowerCase();
            if (country.contains("esp")) {
                guiFactory = new SpainFactory();
            }else{
                guiFactory = new IrelandFactory();
            }
            app = new Application(guiFactory);
            return app;
    }
     private static void menu(){
        int option = 0;
        do{
            System.out.println("0- PARA SALIR, QUALQUIER OTRA TECLA CONTINUAR");
            option = sc.nextInt();
            sc.nextLine();
            Application app = configureApplication();
            app.addClient();
        }while(option != 0);
    }

    public static void main(String[] args) {
    menu();
    }
}
