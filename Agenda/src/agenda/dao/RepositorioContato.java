/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.dao;

import agenda.model.Contato;
import java.util.List;

/**
 *
 * @author Bruno Santos
 */
public interface RepositorioContato {
     List<Contato> listar(String nome);
     Contato get(int id);
     boolean atualizar(Contato contato);
     boolean adicionar(Contato contato);
     boolean deletar(int id);
    
}
