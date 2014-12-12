package Modelo;

import Modelo.Datosinstitucionales;
import Modelo.Detallepaac;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-11T21:34:29")
@StaticMetamodel(Paac.class)
public class Paac_ { 

    public static volatile CollectionAttribute<Paac, Detallepaac> detallepaacCollection;
    public static volatile SingularAttribute<Paac, String> ejerciciofiscal;
    public static volatile SingularAttribute<Paac, Integer> correlativomodificacion;
    public static volatile SingularAttribute<Paac, Datosinstitucionales> codigoinstitucion;
    public static volatile SingularAttribute<Paac, Date> fechaelaboracion;
    public static volatile SingularAttribute<Paac, String> nombreinstitucion;
    public static volatile SingularAttribute<Paac, Character> version;

}