/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controller;

import agenda.dao.RepositorioContato;
import agenda.model.Contato;
import agenda.view.ContatoView;

/**
 *
 * @author Bruno Santos
 */
public class ContatoController {
    private ContatoView mView;
    private RepositorioContato mRepositorio;
    
    public ContatoController(ContatoView view, RepositorioContato repositorio){
        this.mView = view;
        this.mRepositorio = repositorio;
    }
    
    public void buscarContatoPorId(int _id){
        Contato contato = mRepositorio.get(_id);
        if (contato != null) {
            mView.exibirContato(contato);
        }else{
            mView.exibirMensagem("Contato não encontrado");
        }
    }
    
    public void gravarContato(Contato contato){
        boolean retorno = false;
        if (contato.getId() > 0) {
            retorno = mRepositorio.atualizar(contato);
        }else{
            retorno = mRepositorio.adicionar(contato);
        }
        mView.exibirMensagem(retorno ? "Contato gravado com sucesso" : "Não foi possível gravar o contato");
        
        resetarForm(retorno);
    }
    
    public void excluirContato(int id){
        boolean retorno = false;
        if (id > 0) {
            retorno = mRepositorio.deletar(id);
        }
        mView.exibirMensagem(retorno ? "Contato excluido com sucesso" : "Não foi possível excluir o contato");
        resetarForm(retorno);
    }
    
    private void resetarForm(boolean retorno) {
        if (retorno) {
            mView.resetarCampos();
        }
    }
    
}
