public class doggy {
        public static void main(String[] args) {
            // Crear objetos de la clase "Perro"
            Perro perro1 = new Perro("Max", 3);
            Perro perro2 = new Perro("Buddy", 5);
    
            // Obtener y mostrar información de los perros
            System.out.println(perro1.getInfo());
            System.out.println(perro2.getInfo());
    
            // Modificar la edad de un perro
            perro1.setEdad(4);
    
            // Mostrar la nueva información del perro
            System.out.println(perro1.getInfo());
        
    }
}
