package javas;

public class dacirculo {
    public static void main(String[] args) {
        circulo circulo1 = new circulo();
        System.out.println( circulo1.getRadio() + ", Color: " + circulo1.getColor());
        System.out.println("Área de Circulo 1: " + circulo1.calcularArea());

        circulo circulo2 = new circulo(5,"azul");
        System.out.println(circulo2.getRadio() + ", Color: " + circulo2.getColor());
        System.out.println("Área de Circulo 2: " + circulo2.calcularArea());

        circulo2.setRadio(10.0);
        System.out.println("Nuevo radio de Circulo 2: " + circulo2.getRadio());
    }
}