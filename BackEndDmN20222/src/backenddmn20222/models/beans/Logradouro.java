
package backenddmn20222.models.beans;

public class Logradouro {
    
    int id;
    String end;
    String cep;
    String Comp;

    // buscar/excluir usuario pela chave pk
    public Logradouro(int id) {
        this.id = id;
    }
    // listar logradouros por cep
    public Logradouro(String cep) {
        this.cep = cep;
    }
    // para inserir logradouro
    public Logradouro(String end, String cep, String Comp) {
        this.end = end;
        this.cep = cep;
        this.Comp = Comp;
    }
    // para alterar dados de pessoa
    public Logradouro(int id, String end, String cep, String Comp) {
        this.id = id;
        this.end = end;
        this.cep = cep;
        this.Comp = Comp;
    }

    public Logradouro(String end, String cep) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // get e set para valorização de variaveis
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComp() {
        return Comp;
    }

    public void setComp(String Comp) {
        this.Comp = Comp;
    }
// para impressao 
    @Override
    public String toString() {
        return "Logradouro{" + "id=" + id + ", end=" + end + ", cep=" + cep + ", Comp=" + Comp + '}';
    }
    
}
