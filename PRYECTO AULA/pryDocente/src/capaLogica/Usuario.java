
package capaLogica;

public class Usuario {
   
   private String nombre;
   private String password;
   private String horario[][];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String[][] getHorario() {
        return horario;
    }

    public void setHorario(String horario[][]) {
        this.horario = horario;
    }
    
}
