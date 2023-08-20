package circuloTest;

public class Circulo2 {
    private double Radio;
    private double area;
    
    public Circulo2()
    {  //constructor predeterminado o por default sin argumentos
Radio=5.0;

    }

public Circulo2(double radio, double area){
    //Constructor sobrecargado
    this.Radio=6.0;
}

public void setRadio(double radio) {
    Radio = radio;
}


    public String getRadio() {
        return "El radio es: "+ Radio;
    }

    public double calcularArea() {
        return area=Radio*Radio*Math.PI;
    }
    

    // Método toString() para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Círculo [Radio=" + Radio + ", Área=" + calcularArea() + "]";
    }
}
