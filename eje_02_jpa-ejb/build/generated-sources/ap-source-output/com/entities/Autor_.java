package com.entities;

import com.entities.Libros;
import com.entities.Pais;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-22T22:08:35")
@StaticMetamodel(Autor.class)
public class Autor_ { 

    public static volatile SingularAttribute<Autor, Date> fechaNac;
    public static volatile SingularAttribute<Autor, String> nombreAutor;
    public static volatile SingularAttribute<Autor, String> idAutor;
    public static volatile SingularAttribute<Autor, Pais> idPais;
    public static volatile ListAttribute<Autor, Libros> librosList;
    public static volatile SingularAttribute<Autor, String> apellidoAutor;
    public static volatile SingularAttribute<Autor, Date> fechaDef;

}