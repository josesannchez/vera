package VERA.COM;

import java.io.Serializable;

/**
 * Created by Sayem on 12/5/2017.
 */

public class TeachersModel implements Serializable {

    private String nombre;
    private String apellido;
    private String correo;
    private String celular;


    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getCourse() {
        return apellido;
    }

    public void setCourse(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return correo;
    }

    public void setEmail(String correo) {
        this.correo = correo;
    }

    public String getPhone() {
        return celular;
    }

    public void setPhone(String celular) {
        this.celular = celular;
    }
}
