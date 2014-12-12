package Modelo;

import Modelo.Detallesolicitudobra;
import Modelo.UnidadSolicitante;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-11T21:34:29")
@StaticMetamodel(Solicitudobra.class)
public class Solicitudobra_ { 

    public static volatile SingularAttribute<Solicitudobra, Short> idSolicitud;
    public static volatile SingularAttribute<Solicitudobra, String> cargoautorizante;
    public static volatile SingularAttribute<Solicitudobra, String> justificacion;
    public static volatile SingularAttribute<Solicitudobra, String> formaentrega;
    public static volatile SingularAttribute<Solicitudobra, String> dependenciaautorizante;
    public static volatile SingularAttribute<Solicitudobra, String> nombreadmcontrato;
    public static volatile SingularAttribute<Solicitudobra, Date> fecha;
    public static volatile SingularAttribute<Solicitudobra, String> dependenciaadmincontrato;
    public static volatile SingularAttribute<Solicitudobra, String> observaciones;
    public static volatile SingularAttribute<Solicitudobra, String> dependenciasolicitante;
    public static volatile SingularAttribute<Solicitudobra, String> otrascondiciones;
    public static volatile SingularAttribute<Solicitudobra, String> nombresolicitante;
    public static volatile SingularAttribute<Solicitudobra, String> cargosolicitante;
    public static volatile SingularAttribute<Solicitudobra, String> cargoadmincontrato;
    public static volatile SingularAttribute<Solicitudobra, UnidadSolicitante> idUs;
    public static volatile SingularAttribute<Solicitudobra, String> nombreautorizante;
    public static volatile SingularAttribute<Solicitudobra, BigDecimal> valorestimado;
    public static volatile CollectionAttribute<Solicitudobra, Detallesolicitudobra> detallesolicitudobraCollection;
    public static volatile SingularAttribute<Solicitudobra, String> lugarentrega;

}