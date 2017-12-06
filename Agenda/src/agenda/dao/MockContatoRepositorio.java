/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.dao;

import agenda.model.Contato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno Santos
 */
public class MockContatoRepositorio implements RepositorioContato{
    private List<Contato> mDataset;
    
    public MockContatoRepositorio(){
        mDataset = new ArrayList<>();
        mDataset.add(new Contato(1,"Hulk","hulk@gmail.com","(11) 987126-009"));
        mDataset.add(new Contato(2,"Captao America","captao@gmail.com","(11) 2234-0988"));
        mDataset.add(new Contato(3,"Thor","thor@gmail.com","(11) 98126-009"));
        mDataset.add(new Contato(4,"Homem de Ferro","iroman@gmail.com","(11) 3333-1009"));
    }
    

    @Override
    public List<Contato> listar(String nome) {
        return this.mDataset;
    }

    @Override
    public Contato get(int id) {
        for (Contato contato : mDataset) {
            if (contato.getId() == id) {
                return contato;
            }
        }
        return null;
    }

    @Override
    public boolean atualizar(Contato contato) {
        for (Contato c : mDataset) {
            if (contato.getId() == c.getId()) {
                c.setNome(contato.getNome());
                c.setEmail(contato.getEmail());
                c.setTelefone(contato.getTelefone());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean adicionar(Contato contato) {
        int id = mDataset.get(mDataset.size() -1).getId();
        contato.setId(++id);
        mDataset.add(contato);
        return true;
    }

    @Override
    public boolean deletar(int id) {
        int index = -1;
        for(int i = 0; i < mDataset.size(); i++){
            if (mDataset.get(i).getId() == id) {
                index = i;
            }
        }
        if (index != -1) {
            mDataset.remove(index);
            return true;
        }
        return false;
    }
    
}
