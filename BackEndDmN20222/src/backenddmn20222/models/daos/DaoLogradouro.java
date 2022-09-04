package backenddmn20222.models.daos;

import backenddmn20222.models.beans.Logradouro;
import java.util.ArrayList;
import java.util.List;

public class DaoLogradouro {
    
    public Logradouro inserir (Logradouro log) {
       log.setId(1000);
       return log;
    }

    public Logradouro buscar (Logradouro log) {
       log.setId(1000);
       return log;
    }

    public Logradouro alterar (Logradouro log) {
       log.setId(1000);
       return log;
    }

    public Logradouro excluir (Logradouro log) {
       log.setId(1000);
       return log;
    }

    public List<Logradouro> listar(Logradouro log) {
        List<Logradouro> listaLog = new ArrayList<>();
        listaLog.add(log);
        return listaLog;
    }
}
