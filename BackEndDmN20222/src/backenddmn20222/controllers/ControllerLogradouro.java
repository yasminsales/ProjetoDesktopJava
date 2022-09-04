
package backenddmn20222.controllers;
import backenddmn20222.models.beans.Logradouro;
import backenddmn20222.models.daos.DaoLogradouro;
import java.util.List;
/**
 *
 * @author yasmin.sandri.sales
 */
public class ControllerLogradouro {
    static DaoLogradouro daoLog;
    
    public Logradouro inserir (Logradouro log) {
        daoLog = new DaoLogradouro(); 
        return daoLog.inserir(log);
    }
    public Logradouro alterar (Logradouro log) {
        daoLog = new DaoLogradouro(); 
        return daoLog.alterar(log);
    }
    public List<Logradouro> listar (Logradouro log) {
        daoLog = new DaoLogradouro();
        return daoLog.listar(log);
    }
    public Logradouro excluir(Logradouro log) {
        daoLog = new DaoLogradouro(); 
        return daoLog.excluir(log);
    }
    public Logradouro buscar(Logradouro log) {
        daoLog = new DaoLogradouro(); 
        return daoLog.buscar(log);
    }

    public boolean validar(Logradouro logEnt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
