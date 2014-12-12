package Modelo;

import Modelo.Solicitudobra;
import Modelo.Unspsc;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-12T16:02:05")
@StaticMetamodel(Detallesolicitudobra.class)
public class Detallesolicitudobra_ { 

    public static volatile SingularAttribute<Detallesolicitudobra, String> obrasolicitada;
    public static volatile SingularAttribute<Detallesolicitudobra, Solicitudobra> idSolicitud;
    public static volatile SingularAttribute<Detallesolicitudobra, Integer> idDetalle;
    public static volatile SingularAttribute<Detallesolicitudobra, Integer> cantidad;
    public static volatile SingularAttribute<Detallesolicitudobra, String> especifictecnicas;
    public static volatile SingularAttribute<Detallesolicitudobra, Unspsc> codigounspsc;
    public static volatile SingularAttribute<Detallesolicitudobra, String> unidadmedida;

}