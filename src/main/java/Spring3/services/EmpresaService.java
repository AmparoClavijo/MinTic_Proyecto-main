package Spring3.services;

import Sprint2.Empresa;

import java.util.List;

public class EmpresaService {
    private RepositorioEmpresa repositiorioE;


    public EmpresaService(RepositorioEmpresa repositiorioE){
        this.repositiorioE = repositiorioE; }

    public List<Empresa> getInformacion(){

        return this.repositiorioE.findAll();
    }

    public Empresa actualizarEmpresa(@PathVariable Long id, @RequestBody Empresa e){
        Empresa empresaActual = this.repositiorioE.findById(id).orElsethrow();
        empresaActual.setNombre(e.getNombre());
        empresaActual.setDireccion(e.getDireccion());
        empresaActual.setTelefono(e.getTelefono());
        empresaActual.setNit(e.getNit());
        return this.repositiorioE.save(empresaActual);
    }

    public Empresa eliminarEmpresa(Long id){
        Empresa empresaActual = this.repositiorioE.findById(id).orEñsethrow();
        this.repositiorioE.deleteById(id);
        return empresaActual;
    }

}
