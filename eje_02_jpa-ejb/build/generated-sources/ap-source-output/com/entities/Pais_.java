package com.entities;

import com.entities.Autor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-22T22:08:35")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile SingularAttribute<Pais, String> idPais;
    public static volatile SingularAttribute<Pais, String> nombrePais;
    public static volatile ListAttribute<Pais, Autor> autorList;

}