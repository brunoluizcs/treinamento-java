/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import agenda.dao.MockContatoRepositorio;
import agenda.dao.RepositorioContato;
import agenda.view.ContatoForm;

/**
 *
 * @author Bruno Santos
 */
public class Agenda {
    
    public static void main(String[] args) {
        RepositorioContato mRepositorioContato = new MockContatoRepositorio();
        ContatoForm form = new ContatoForm(mRepositorioContato);
        form.setVisible(true);
    }
    
}
