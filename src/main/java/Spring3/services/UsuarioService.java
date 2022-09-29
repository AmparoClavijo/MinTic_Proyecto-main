package Spring3.services;

import Sprint2.Empleado;

import java.util.List;

public class UsuarioService {
    private RepositorioUsuario repositorioU;

    public UsuarioService(RepositorioUsuario repositorioU){
        this.repositorioU = repositorioU;}

    public List<Empleado> getInformacion(){
        return.repositorioU.findAll();}


    public Empleado crearUsuario(Empleado nuevoUsuario){
        return this.repositorioU.save(nuevoUsuario);}

    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado e){
        Empleado empleadoActual = this.repositorioU.findById(id).orElseThrow();
        empleadoActual.setCorreoEmpleado((e.getCorreoEmpleado()));
        empleadoActual.setNombreEmpleado(e.getNombreEmpleado());
        empleadoActual.setTipo(e.getTipo());
        empleadoActual.setEmp(e.getEmp());
        return this.repositorioU.save(empleadoActual);
    }
    public Empleado eliminarEmpleado(Long id){
        Empleado empleadoActual = this.repositorioU.findById(id).orElseThrow();
        this.repositorioU.deleteById(id);
        return empleadoActual;
    }
}
