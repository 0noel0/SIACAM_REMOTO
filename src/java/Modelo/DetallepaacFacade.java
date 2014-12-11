/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author noel
 */
@Stateless
public class DetallepaacFacade extends AbstractFacade<Detallepaac> {
    @PersistenceContext(unitName = "SIACAM_REMOTOPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetallepaacFacade() {
        super(Detallepaac.class);
    }
    
}