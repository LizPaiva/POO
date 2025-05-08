public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;


    public Coche() {
        this.kilometraje = 500;
    }


    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = 500;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }


    public void actualizarKilometraje(int km) {
        if (km > 0) {
            kilometraje += km;
            System.out.println(" Kilometraje .");
        } else {
            System.out.println("debe ser un valor positivo.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }

    public void mostrarInformacion(boolean detallado) {
        mostrarInformacion();
        if (detallado) {
            System.out.println("Kilometraje: " + kilometraje + " km");
        }
    }
}
