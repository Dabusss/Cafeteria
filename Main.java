import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona la operación que desea realizar: ");
        System.out.println("1- Mostrar por pantalla el inventario disponible");
        System.out.println("2- Realizar una venta");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                showStock();
                break;
        }

        
    }
    public static void showStock(){
            System.out.println("A continuacion se mostrará el stock disponible.");
            // TODO: Method using FileReader
    }
}

