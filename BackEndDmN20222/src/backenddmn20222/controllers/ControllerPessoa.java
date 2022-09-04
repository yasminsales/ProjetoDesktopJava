
package backenddmn20222.controllers;

import backenddmn20222.models.beans.Pessoa;
import backenddmn20222.models.daos.DaoPessoa;
import java.util.List;

public class ControllerPessoa {

    static DaoPessoa daoPes;
    
    public Pessoa inserir (Pessoa pes) {
        daoPes = new DaoPessoa(); 
        return daoPes.inserir(pes);
    }
    public Pessoa alterar (Pessoa pes) {
        daoPes = new DaoPessoa(); 
        return daoPes.alterar(pes);
    }
    public List<Pessoa> listar (Pessoa pes) {
        daoPes = new DaoPessoa(); 
        return daoPes.listar(pes);
    }
    public Pessoa excluir(Pessoa pes) {
        daoPes = new DaoPessoa(); 
        return daoPes.excluir(pes);
    }
    public Pessoa buscar(Pessoa pes) {
        daoPes = new DaoPessoa(); 
        return daoPes.buscar(pes);
    }

}
