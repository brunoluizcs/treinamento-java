/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.view;

import agenda.model.Contato;

/**
 *
 * @author Bruno Santos
 */
public interface ContatoView {
    void exibirContato(Contato contato);
    void resetarCampos();
    void exibirMensagem(String mensagem);
    
    
}
