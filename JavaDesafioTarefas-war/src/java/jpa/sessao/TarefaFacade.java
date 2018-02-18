/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.sessao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entidades.Tarefa;

/**
 *
 * @author Blithe
 */
@Stateless
public class TarefaFacade extends AbstractFacade<Tarefa> {

    @PersistenceContext(unitName = "JavaDesafioTarefas-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TarefaFacade() {
        super(Tarefa.class);
    }
    
}
