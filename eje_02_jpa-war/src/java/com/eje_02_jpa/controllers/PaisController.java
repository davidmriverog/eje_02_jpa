package com.eje_02_jpa.controllers;

import com.entities.models.PaisFacade;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
// Importamos todas las funcione .util
import java.util.*;
// Importamos la Libreria EJB Pais
import javax.ejb.EJB;
// Importamos la Estructura del Modelo Pais
import com.entities.*;


@ManagedBean
@SessionScoped
public class PaisController implements Serializable{
    

    // Llamamos el Bean de la Entities Pais
    @EJB
    private PaisFacade paisFacade;
    
    private Pais p;
  
    public PaisController() {
        
      this.p = new Pais();
    }

    // Consultamos todos los datos
    public List<Pais> findAll(){
        
        return this.paisFacade.findAll();
    }
    
    public String add(){
      
        this.paisFacade.create(this.p);
        
        return "index";
    }
    
    public void delete(Pais ps){
       
        this.paisFacade.remove(ps);
        
    }
    
    // Tomamos el Registro a Editar desde del DataTable
    public String edit(Pais ps){
        
        this.p=ps;
        return "edit";
    }
    
    // Efectuamos la Edicion
    public String edit(){
        this.paisFacade.edit(this.p);
        return "index";
    }
    
    // Encapsulamientos
      public Pais getP() {
        return p;
    }

    public void setP(Pais p) {
        this.p = p;
    }
}
