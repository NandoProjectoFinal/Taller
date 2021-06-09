public class ram {
    private String marca;
    private int frecuencia;
    private int capacidad;

    @Override
    public String toString() {
        return "ram{" +
                "marca='" + marca + '\'' +
                ", frecuencia=" + frecuencia +
                ", capacidad=" + capacidad +
                '}';
    }

    public ram(String marca, int frecuencia, int capacidad) {
        this.marca = marca;
        this.frecuencia = frecuencia;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
