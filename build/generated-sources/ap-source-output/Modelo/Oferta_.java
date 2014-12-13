package Modelo;

import Modelo.Detalleoferta;
import Modelo.Expedienteproceso;
import Modelo.Oferente;
import Modelo.OfertaPK;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-12T18:14:48")
@StaticMetamodel(Oferta.class)
public class Oferta_ { 

    public static volatile SingularAttribute<Oferta, BigDecimal> montooferta;
    public static volatile SingularAttribute<Oferta, Expedienteproceso> expedienteproceso;
    public static volatile SingularAttribute<Oferta, OfertaPK> ofertaPK;
    public static volatile SingularAttribute<Oferta, Oferente> oferente;
    public static volatile SingularAttribute<Oferta, String> estadooferta;
    public static volatile CollectionAttribute<Oferta, Detalleoferta> detalleofertaCollection;

}