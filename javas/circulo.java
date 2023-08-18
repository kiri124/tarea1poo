package javas;

public class circulo {
    private double radio;
    private String color;

      public circulo()
    {
        //constructor predeterminado o por default sin argumentos
radio=6.0;
color="amarillo";
    }

    public circulo(double radio, String color) {
        //constructor 
        this.radio = 5.0;
        this.color = "azul";
    }
  
    public double getRadio() {
        //metodo
        System.out.print("el valor del radio es:");
        return radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

 public double calcularArea() {
    return Math.PI * radio * radio;
}

}


