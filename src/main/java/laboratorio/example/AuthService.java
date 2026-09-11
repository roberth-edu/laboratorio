package laboratorio.example;

import java.util.HashMap;

public class AuthService  {

    HashMap<String, Usuario> Credenciales = new HashMap<>();

    public boolean RegistroUsuarios(String userName, String password, String nombreCompleto, String email)
    {

        Usuario usuarios = new Usuario(userName, password, nombreCompleto, email);

        Credenciales.put(userName, usuarios);
        System.out.println("Usuario correctamente agregado");
        return true;
    }

    public boolean Login(String userName, String Password)
    {
        Usuario usuario = Credenciales.get(userName);
        if (usuario == null)
        {
            System.out.println("No existe el usuario");
            return false;
        } else if (usuario.verificarContraseña(Password) == false)
        {
            System.out.println("Incio de session invalido");
            return false;
        }

        System.out.println("Incio de session exitoso");
        return usuario.verificarContraseña(Password);

    }

    public boolean EliminacionDeCuenta(String username)
    {
        if (Credenciales.containsKey(username))
        {
            Credenciales.remove(username);
            System.out.println("Usuario eliminado");
            return true;
        }
        System.out.println("El usuario no fue eliminado");
        return false;
    }

    public boolean DisponibilidadUser(String UserName)
    {

        if (Credenciales.containsKey(UserName))
        {
            System.out.println("El nombre de usuario ya esta registrado");
            return true;
        }
        else
        {
            System.out.println("El nombre del usuario esta libre");
            return false;
        }

    }
}
