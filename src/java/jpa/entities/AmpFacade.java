/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rickaguayo
 */
@Stateless
public class AmpFacade extends AbstractFacade<Amp> {

    @PersistenceContext(unitName = "GuitarGearPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AmpFacade() {
        super(Amp.class);
    }
    
}
