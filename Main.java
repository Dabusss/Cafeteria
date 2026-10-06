import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
        
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona la operación que desea realizar: ");
        System.out.println("1- Mostrar por pantalla el inventario disponible");
        System.out.println("2- Realizar una venta");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                showStock();
                break;

            case 2:
                registerSell();
                break;
        }
    }
    public static void fileReader(){
        //TODO: Finish method + fix if needed
        try {
            FileInputStream cafes = new FileInputStream(new File("MisCafes.txt"));
            System.out.println(cafes.read());

            cafes.close();
        } catch (Exception e) {
        }
    }
    public static void showStock(){
            System.out.println("A continuacion se mostrará el stock disponible.");
    }

    public static void registerSell(){
        //TODO: Create the whole method
    }
    
    
}

