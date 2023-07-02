package principal.controller;

import java.util.List;
import principal.daos.DAO;
import principal.daos.MedicamentoDAO;
import principal.model.Medicamento;

public class MedicamentoController {

    private DAO<Medicamento> dao = new MedicamentoDAO();

    //CREATE
    public Medicamento create(Medicamento medicamento){
        return dao.salvar(medicamento);
    }

    //READ
    public List<Medicamento> read(){
        return dao.listar();
    }

    //UPDATE
    public Medicamento update(Medicamento medicamento){
        return dao.atualizar(medicamento);
    }

    //DELETE
    public void delete(Integer id){
        dao.excluir(id);
    }

    //BUSCAR POR ID
    public Medicamento search(Integer id){
        return dao.buscarPorId(id);
    }
}
