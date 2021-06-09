public class computador {
    private String nombre;
    private String marca;
    private ram ram1;

    public computador(String nombre, String marca, ram ram1) {
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
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ram getRam1() {
        return ram1;
    }

    public void setRam1(ram ram1) {
        this.ram1 = ram1;
    }

}
