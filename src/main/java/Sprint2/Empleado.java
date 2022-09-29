package Sprint2;

enum tipo_Rol{
    administrativo,operativo
}



public class Empleado {
private  String nombreEmpleado;
private  String correoEmpleado;
private  tipo_Rol tipo;
private Empresa  emp;


    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public tipo_Rol getTipo() {
        return tipo;
    }

    public void setTipo(tipo_Rol tipo) {
        this.tipo = tipo;
    }

    public Empresa getEmp() {
        return emp;
    }

    public void setEmp(Empresa emp) {
        this.emp = emp;
    }
}
