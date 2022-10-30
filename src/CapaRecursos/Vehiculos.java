package CapaRecursos;


public class Vehiculos {
    private int id;
    private String marca;
    private String modelo;
    private String cilindraje;

    public void SetMarca(String marca) {
        this.marca = marca;
    }

    public String GetMarca() {
        return this.marca;
    }

    {
        this.marca = marca;

    }

    public void SetModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String GetModelo() {
        return this.modelo;
    }

    public void SetCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String GetCilindraje() {
        return this.cilindraje;
    }

}
