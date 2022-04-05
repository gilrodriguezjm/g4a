/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g4a.dao;

import g4a.entity.Juego;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author gil
 */
@jakarta.ejb.Stateless
public class JuegoFacade extends AbstractFacade<Juego> {

    @PersistenceContext(unitName = "g4aPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JuegoFacade() {
        super(Juego.class);
    }
    
}
