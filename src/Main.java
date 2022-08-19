public class Main {
    public static void main(String[] args) {

        cliente Cliente = new cliente();
        trabajador Trabajador = new trabajador();

        //Forma#1 de hacerlo
        Cliente.nombre = "Enrique Petro";
        Cliente.edad = 38;
        Cliente.telefono = 37893122;
        Cliente.credito = 350.50;
        System.out.println("Hola soy " + Cliente.nombre + ", tengo " + Cliente.edad + " años, mi numero de telefono es "
                + Cliente.telefono + " y mi credito disponible es " + Cliente.credito + " dolares");
        Trabajador.nombre = "Alberto Ruiz";
        Trabajador.edad = 52;
        Trabajador.telefono = 70374492;
        Trabajador.salario = 800;
        System.out.println("Hola soy " + Trabajador.nombre + ", tengo " + Trabajador.edad + " años, mi numero de telefono es "
                + Trabajador.telefono + " y mi credito disponible es " + Trabajador.salario + " dolares");
        //Forma#2 de hacerlo con los setters and getters
        Cliente.setNombre("Juan Reyes");
        Cliente.setEdad(40);
        Cliente.setTelefono(257282);
        Cliente.setCredito(450.20);
        System.out.println("Mi nombre es" + Cliente.getNombre() + ", tengo " + Cliente.getEdad() + " años, mi numero de telefono es "
                + Cliente.getTelefono()+ " y mi credito disponible es " + Cliente.getCredito()+ " dolares");
        Trabajador.setNombre("Oscar Alvarez");
        Trabajador.setEdad(58);
        Trabajador.setTelefono(2478282);
        Trabajador.setSalario(900.20);
        System.out.println("Mi nombre es" + Trabajador.getNombre() + ", tengo " + Trabajador.getEdad() + " años, mi numero de telefono es "
                + Trabajador.getTelefono()+ " y mi credito disponible es " + Trabajador.getSalario() + " dolares");
    }
}