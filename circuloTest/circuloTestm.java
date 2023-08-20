package circuloTest;
public class circuloTestm {

    public static void main(String[] args) {
        // Crear un círculo utilizando el constructor por defecto
        Circulo2 circuloDefault = new Circulo2();
        
        // Imprimir el radio y el área del círculo por defecto
        System.out.println("Círculo con constructor por defecto:");
        System.out.println("Radio: " + circuloDefault.getRadio());
        System.out.println("Área: " + circuloDefault.calcularArea());
        System.out.println();
        
      Circulo2 circuloSobrecargado= new Circulo2(0, 0);
      System.out.println("Circulo con constructor sobrecargado:");
      System.out.println("Radio: " + circuloSobrecargado.getRadio());
        System.out.println("Área: " + circuloSobrecargado.calcularArea());
   
        Circulo2 circuloModificado = new Circulo2();
        
        // Modificar el valor del radio utilizando el método setRadio()
        circuloModificado.setRadio(8); // Modifica el radio a 8.0
        
        // Imprimir el radio y el área del círculo modificado
        System.out.println("Círculo modificado:");
        System.out.println("Radio: " + circuloModificado.getRadio());
        System.out.println("Área: " + circuloModificado.calcularArea());

        Circulo2 circulo = new Circulo2();
        System.out.println(circulo); //  Imprimirá: Círculo [Radio=5.0, Área=78.53981633974483]
      }

   
}