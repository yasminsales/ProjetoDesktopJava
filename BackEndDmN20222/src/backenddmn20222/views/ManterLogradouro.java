
package backenddmn20222.views;

import backenddmn20222.controllers.ControllerLogradouro;
import backenddmn20222.models.beans.Logradouro;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author yasmin.sandri.sales
 */
public class ManterLogradouro {
     public static void menu() {
        String msg = " 1 - Inserir \n 2 - Alterar \n 3 - buscar \n 4 - excluir \n 5 - Listar " ;
        int num = Integer.parseInt(JOptionPane.showInputDialog(msg));
        switch (num) {
            case 1:
                inserir();
                break;
            case 2:
                alterar();
                break;
            case 3:
                buscar();
                break;
            case 4:
                excluir();
                break;
            case 5:
                listar();
                break;
            default:
                System.out.println("Opcao inválida");
        }
    }

    
    public static void inserir() {
        String end = JOptionPane.showInputDialog("Endereço");
        String cep = JOptionPane.showInputDialog("Cep");
        String Comp = JOptionPane.showInputDialog("Complemento");
        Logradouro logEnt = new Logradouro(end,cep, Comp);
        ControllerLogradouro contLog = new ControllerLogradouro();
        Logradouro logSaida = contLog.inserir(logEnt);
        JOptionPane.showMessageDialog(null, logSaida.toString());
    }
    
    public static void alterar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String end  = JOptionPane.showInputDialog("Endereço");
        String cep = JOptionPane.showInputDialog("Cep");
        String Comp = JOptionPane.showInputDialog("Complemento");
        Logradouro logEnt = new Logradouro(id, end, cep, Comp);
        ControllerLogradouro contLog = new ControllerLogradouro();
        Logradouro logSaida = contLog.alterar(logEnt);
        JOptionPane.showMessageDialog(null, logSaida.toString());
    }

    public static void buscar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Logradouro logEnt = new Logradouro(id);
        ControllerLogradouro contLog = new ControllerLogradouro();
        Logradouro logSaida = contLog.buscar(logEnt);
        JOptionPane.showMessageDialog(null, logSaida.toString());
        
    }
    
    public static void excluir() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Logradouro logEnt = new Logradouro(id);
        ControllerLogradouro contLog = new ControllerLogradouro();
        Logradouro logSaida = contLog.excluir(logEnt);
        JOptionPane.showMessageDialog(null, logSaida.toString());
    }
    
    public static void listar() {
        String cep = JOptionPane.showInputDialog("Cep");
        Logradouro logEnt = new Logradouro(cep);
        ControllerLogradouro contLog = new ControllerLogradouro();
        List<Logradouro> listaLogradouro = contLog.listar(logEnt);
        JOptionPane.showMessageDialog(null, listaLogradouro.get(0).toString());
        
    }

}
