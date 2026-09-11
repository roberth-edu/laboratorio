package laboratorio.example;

public class Usuario {

    private String userName;
    private String password;
    private String nombreCompleto;
    private String email;

    public Usuario(String userName, String password, String nombreCompleto, String email) {
        this.userName = userName;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public boolean verificarContraseña(String password)
    {
        return this.password.equals(password);
    }
}
