package principal.controller;

import java.util.List;
import principal.daos.DAO;
import principal.daos.PacienteDAO;
import principal.model.Paciente;

public class PacienteController {

    private DAO<Paciente> dao = new PacienteDAO();

    //CREATE
    public Paciente create(Paciente paciente){
        return dao.salvar(paciente);
    }

    //READ
    public List<Paciente> read(){
        return dao.listar();
    }

    //UPDATE
    public Paciente update(Paciente paciente){
        return dao.atualizar(paciente);
    }

    //DELETE
    public void delete(Integer id){
        dao.excluir(id);
    }

    //BUSCAR POR ID
    public Paciente search(Integer id){
        return dao.buscarPorId(id);
    }
}
