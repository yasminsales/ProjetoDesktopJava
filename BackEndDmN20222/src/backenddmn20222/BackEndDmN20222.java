
package backenddmn20222;

import backenddmn20222.views.ManterLogradouro;
import backenddmn20222.views.ManterPessoa;
import backenddmn20222.views.ManterUsuario;
import backenddmn20222.views.ManterUsuarioPessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author lab04aluno
 */
public class BackEndDmN20222 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(ManterUsuario.validar()) {
            menu();
        } else {
            JOptionPane.showMessageDialog(null,"Usuario Inválido");            
        }
    }

    public static void menu() {
        String msg = " 0 - Sair \n 1 - Usuario \n 2 - Pessoa \n 3 - UsuarioPessoa \n 4 - Logradouro";
        int num = Integer.parseInt(JOptionPane.showInputDialog(msg));
        switch (num) {
            case 0:
                int sair = JOptionPane.showConfirmDialog(null,"Deseja Sair");
                if (sair > 0) menu();
                break;
            case 1:
                ManterUsuario.menu();
                break;
            case 2:
                ManterPessoa.menu();
                break;
            case 3:
                ManterUsuarioPessoa.menu();
                break;
            case 4: 
                ManterLogradouro.menu();
            default:
                System.out.println("Opção inválido");
        }
    }
    
}
