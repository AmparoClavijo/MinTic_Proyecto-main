package Spring3.controllers;

import Spring3.services.EmpresaService;
import Sprint2.Empresa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class EmpresaController {
    EmpresaService ser1;

    public EmpresaController(EmpresaService ser1){
        this.ser1 = ser1;}

    @GetMapping("/informacion")
    public List<Empresa> informacion(){
        return this.ser1.getInformacion();}

    @PostMapping("/crear")
    public Empresa crearEmpresa(@RequestBody Empresa e){
        return this.ser1.crearEmpresa(e);}

    @PutMapping("/actualizar/{nit}")
    public Empresa actualizarEmpresa(@PathVariable Long nit, @RequestBody Empresa e){...}

    @DeleteMapping("/eliminar/{nit}")
    public Empresa eliminarEmpresa(@PathVariable(value = "nit") long nit){
        return this.ser1.eliminarEmpresa(nit);
    }

}
