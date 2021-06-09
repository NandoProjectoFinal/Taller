import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class ram {
    private String marca;
    private String frecuencia;
    private String nombre;


    public ram() {
        this.marca = getMarca();
        this.frecuencia = getFrecuencia();
        this.nombre = getNombre();
        };

    public ram(String marca, String frecuencia, String nombre) {
        this.marca = marca;
        this.frecuencia = frecuencia;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ram{" +
                "marca='" + marca + '\'' +
                ", frecuencia='" + frecuencia + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getMarca() {
        Random rnum = new Random();
        int a = rnum.nextInt(5);
        String[] marca = marca();
        return marca[a];
    }

    public void setMarca(String marca) {
        System.out.println("A que marca quiere cambiar?");
        Scanner teclado = new Scanner(System.in);
        this.marca = teclado.next();
    }

    public String getFrecuencia() {
        Random rnum = new Random();
        int a = rnum.nextInt(5);
        String[] frecuencia = frecuencia();
        return frecuencia[a];
    }

    public void setFrecuencia() {
        System.out.println("A que frecuencia quiere cambiar?");
        Scanner teclado = new Scanner(System.in);
        this.frecuencia = teclado.next();
    }

    public String getNombre() {
        Random rnum = new Random();
        int a = rnum.nextInt(5);
        String[] nombre = nombre();
        return nombre[a];
    }

    public void setNombre(String nombre) {
        System.out.println("A que nombre quiere cambiar?");
        Scanner teclado = new Scanner(System.in);
        this.nombre = teclado.next();
    }

    public static String[] marca() {
        Path archivo = Paths.get("D:\\Proyectos\\untitled1\\Ram\\marca");
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido");
        }
        String[] palabra = contenido.split("\n");
        return palabra;
    }
    public static String[] nombre() {
        Path archivo = Paths.get("D:\\Proyectos\\untitled1\\Ram\\Nombre");
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido");
        }
        String[] palabra = contenido.split("\n");
        return palabra;
    }
    public static String[] frecuencia() {
        Path archivo = Paths.get("D:\\Proyectos\\untitled1\\Ram\\Frecuencia");
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido");
        }
        String[] palabra = contenido.split("\n");
        return palabra;
    }
}
