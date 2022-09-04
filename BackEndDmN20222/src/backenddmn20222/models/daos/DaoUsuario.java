/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddmn20222.models.daos;

import backenddmn20222.models.beans.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lab04aluno
 */
public class DaoUsuario {

    public Usuario validar(Usuario usu){
        Usuario usuSaida = new Usuario("BITTENCOURT");
        return usuSaida;
    }

    public Usuario inserir(Usuario usuEnt) {
        usuEnt.setId(1);
        return usuEnt;
    }

    public Usuario alterar(Usuario usuEnt) {
        usuEnt.setLogin("TESTE ALTERACAO");
        return usuEnt;
    }

    public List<Usuario> listar(Usuario usuEnt) {
        List<Usuario> listaUsu = new ArrayList<>();
        listaUsu.add(usuEnt);
        return listaUsu;
    }

    public Usuario excluir(Usuario usuEnt) {
        return usuEnt;
    }

    public Usuario buscar(Usuario usuEnt) {
        return usuEnt;
    }
    
}
