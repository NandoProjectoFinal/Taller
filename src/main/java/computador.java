import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class computador {
    private String nombre;
    private String marca;
    private String ram1;

    public computador(String nombre, String marca, String ram1) {
        this.nombre = nombre;
        this.marca = marca;
        this.ram1 = ram1;
    }

    @Override
    public String toString() {
        return "computador{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", ram1=" + ram1 +
                '}';
    }

    public String getNombre() {
        Random rnum = new Random();
        int a = rnum.nextInt(6);
        String[] nombre = nombre();
        return nombre[a];
    }

    public void setNombre(String nombre) {
        System.out.println("A que nombre quiere cambiar?");
        Scanner teclado = new Scanner(System.in);
        this.nombre = teclado.next();
    }

    public String getMarca() {
        Random rnum = new Random();
        int a = rnum.nextInt(6);
        String[] marca = marca();
        return marca[a];
    }

    public void setMarca(String marca) {
        System.out.println("A que marca quiere cambiar?");
        Scanner teclado = new Scanner(System.in);
        this.marca = teclado.next();
    }

    public String getRam1() {
        ram a = new ram();
        return a.toString();
    }

    public void setRam1(String ram1) {
        ram a = new ram();
        a.toString(a.setMarca(), a.setFrecuencia(), a.setNombre())

        this.ram1 = ram1;
    }

    public static String[] nombre() {
        Path archivo = Paths.get("D:\\Proyectos\\untitled1\\Pc\\Nombre");
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido");
        }
        String[] palabra = contenido.split("\n");
        return palabra;
    }
    public static String[] marca() {
        Path archivo = Paths.get("D:\\Proyectos\\untitled1\\Pc\\Marca");
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
