package Modelo;

import Modelo.Detallenecesipaac;
import Modelo.Detallepaac;
import Modelo.Detallesolicitudobra;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-12T16:02:05")
@StaticMetamodel(Unspsc.class)
public class Unspsc_ { 

    public static volatile SingularAttribute<Unspsc, String> codigo;
    public static volatile CollectionAttribute<Unspsc, Detallepaac> detallepaacCollection;
    public static volatile SingularAttribute<Unspsc, String> descripcion;
    public static volatile CollectionAttribute<Unspsc, Detallesolicitudobra> detallesolicitudobraCollection;
    public static volatile CollectionAttribute<Unspsc, Detallenecesipaac> detallenecesipaacCollection;

}