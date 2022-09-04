/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddmn20222.controllers;

import backenddmn20222.models.beans.Usuario;
import backenddmn20222.models.daos.DaoUsuario;
import java.util.List;

/**
 *
 * @author lab04aluno
 */
public class ControllerUsuario {
    
    DaoUsuario daoUsu;
    
    public boolean validar (Usuario usu) {
        boolean retorno = false;
        daoUsu = new DaoUsuario();
        Usuario usuSaida = daoUsu.validar(usu);
        System.out.println("Controller " + usuSaida.getLogin());
        retorno = usuSaida.getLogin().equals(usu.getLogin());
        System.out.println("Retorno " + retorno);
        return retorno;
    }

    public Usuario validaWeb (Usuario usu) {
        daoUsu = new DaoUsuario();
        usu = daoUsu.validar(usu);
        return usu;
    }

    public Usuario inserir(Usuario usuEnt) {
        daoUsu = new DaoUsuario();
        usuEnt = daoUsu.inserir(usuEnt);
        return usuEnt;
    }

    public Usuario alterar(Usuario usuEnt) {
        daoUsu = new DaoUsuario();
        usuEnt = daoUsu.alterar(usuEnt);
        return usuEnt;
    }

    public List<Usuario> listar(Usuario usuEnt) {
        daoUsu = new DaoUsuario();
        List<Usuario> listaUsu = daoUsu.listar(usuEnt);
        return listaUsu;
    }

    public Usuario excluir(Usuario usuEnt) {
        daoUsu = new DaoUsuario();
        usuEnt = daoUsu.excluir(usuEnt);
        return usuEnt;
    }

    public Usuario buscar(Usuario usuEnt) {
        daoUsu = new DaoUsuario();
        usuEnt = daoUsu.buscar(usuEnt);
        return usuEnt;
    }

    
}
