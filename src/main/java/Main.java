import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner teclado = new Scanner(System.in);
        boolean b = false;
        do {
            System.out.println("Hola bienvenido que desea hacer");
            System.out.println("[1] ver datos");
            System.out.println("[2] modificar datos");
            System.out.println("[3] Salir");
            int a =-6;
            switch (teclado.next()){
                case "1":
                    mostrarDatos();
                    do {
                        System.out.println("Desea repetir?");
                        System.out.println("[1] si");
                        System.out.println("[2] no");
                        switch (teclado.next()){
                            case "1": b= false;
                                a=1;
                                break;
                            case "2": b=true;
                                a=1;
                                break;
                            default:  a =0;
                                break;
                        }
                    }while (a==0);
                break;
                case "2":
                    editarDatos();
                    do {
                        System.out.println("Desea repetir?");
                        System.out.println("[1] si");
                        System.out.println("[2] no");
                        switch (teclado.next()){
                            case "1": b= false;
                                    a=1;
                                break;
                            case "2": b=true;
                                a=1;
                                break;
                            default:  a =0;
                                break;
                        }
                    }while (a==0);
                break;
                case "3":
                    System.out.println("Gracias por usar el programa");
                    b=true;
                    break;
                default: b=false;
                break;
            }
        }while (b==false);
    }

    private static void editarDatos() {
    }

    private static void mostrarDatos() {

    }
}
