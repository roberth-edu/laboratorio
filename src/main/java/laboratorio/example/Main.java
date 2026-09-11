package laboratorio.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int Respuesta;
        String userName;
        String password;
        String nombreCompleto;
        String Email;
        AuthService service = new AuthService();

        do {
            System.out.println("====================================");
            System.out.println("AUTHSECURE - Control de acceso");
            System.out.println("====================================");
            System.out.println("1. Registrar nuevo ususario");
            System.out.println("2. Iniciar sesion (Autentificacion) ");
            System.out.println("3. Eliminar cuenta de ususario");
            System.out.println("4. Verificar disponibilidad del username");
            System.out.println("5. Salir");
            Respuesta = scan.nextInt();
            scan.nextLine();

            switch (Respuesta)
            {
                case 1:
                    System.out.println("Ingrese el userName del usuario");
                    userName = scan.nextLine();
                    System.out.println("Ingrese su contraseña");
                    password = scan.nextLine();
                    System.out.println("Ingrese el nombre completo del usuario");
                    nombreCompleto = scan.nextLine();
                    System.out.println("Ingrese el email del usuario");
                    Email = scan.nextLine();

                    service.RegistroUsuarios(userName, password, nombreCompleto, Email);

                    break;
                case 2:
                    System.out.println("Ingrese su userName");
                    userName = scan.nextLine();
                    System.out.println("Ingrese su contrasña");
                    password = scan.nextLine();
                    service.Login(userName, password);

                    break;
                case 3:

                    System.out.println("Escribe el usuario que necesita eliminar");
                    userName = scan.nextLine();
                    service.EliminacionDeCuenta(userName);
                    break;
                case 4:
                    System.out.println("Escribe el username para saber si esta disponible ");
                    userName = scan.nextLine();
                    service.DisponibilidadUser(userName);
                    break;
            }
        }while (Respuesta != 5);
        System.out.println("Gracias por usar nuestro sistema");
    }
}