package Spring3.controllers;

import Spring3.services.UsuarioService;
import Sprint2.Empleado;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class UsuarioController {
    UsuarioService ususer1;

    public UsuarioController(UsuarioService ususer1){
        this.ususer1 = ususer1;}

    @GetMApping("/usuario")
    public List<Empleado> informacion(){
        return this.ususer1.getInformacion();}

    @PostMApping("/usuario")
    public Empleado crearEmpleado(@RequestBody Empleado e){
        return this.ususer1.crearUsuario(e); }

    @PutMapping("/usuario/{id}")
    public Empleado actualizarEmpresa(@PathVariable Long nit, @RequestBody Empleado e){...}

    @DeleteMpping("/usuario/{id}")
    public Empleado eliminarEmpresa(@PathVariable(value = "id") Long id) {
        return this.ususer1.eliminarEmpleado(id);
    }
}
