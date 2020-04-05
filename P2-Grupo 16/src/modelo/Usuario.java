package modelo;

public class Usuario {

    protected String nombre;
    protected String apllidos;
    protected String nick;
    protected String email;
    protected String contraseña;

    public Usuario() {

    }

    public Usuario(String nombre, String apllidos, String nick, String email, String contraseña) {
        this.nombre = nombre;
        this.apllidos = apllidos;
        this.nick = nick;
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "usarios.Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apllidos='" + apllidos + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
