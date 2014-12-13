package Modelo;

import Modelo.Solicitudobra;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-12T18:14:48")
@StaticMetamodel(UnidadSolicitante.class)
public class UnidadSolicitante_ { 

    public static volatile SingularAttribute<UnidadSolicitante, String> nombreUnidad;
    public static volatile SingularAttribute<UnidadSolicitante, Short> idUs;
    public static volatile CollectionAttribute<UnidadSolicitante, Solicitudobra> solicitudobraCollection;

}