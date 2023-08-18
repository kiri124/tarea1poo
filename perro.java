class Perro {
    // Variables de instancia privadas
    private String nombre;
    private int edad;

    // Constructor de la clase
    public Perro(String nombre, int edad) {
        //instacio 
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre del perro GET
    public String getNombre() {
        return nombre;
    }

    // Método para establecer la edad del perro SET
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para obtener la información del perro GET
    public String getInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad + " años";
    }
}