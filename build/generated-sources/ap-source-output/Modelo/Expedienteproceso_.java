package Modelo;

import Modelo.Adenda;
import Modelo.Detalleficharetirobases;
import Modelo.Oferente;
import Modelo.Oferta;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-12T18:14:48")
@StaticMetamodel(Expedienteproceso.class)
public class Expedienteproceso_ { 

    public static volatile SingularAttribute<Expedienteproceso, String> denominacionproceso;
    public static volatile CollectionAttribute<Expedienteproceso, Adenda> adendaCollection;
    public static volatile SingularAttribute<Expedienteproceso, String> tipoproceso;
    public static volatile SingularAttribute<Expedienteproceso, String> responsableproceso;
    public static volatile SingularAttribute<Expedienteproceso, String> estadoproceso;
    public static volatile SingularAttribute<Expedienteproceso, String> codigoproceso;
    public static volatile CollectionAttribute<Expedienteproceso, Detalleficharetirobases> detalleficharetirobasesCollection;
    public static volatile SingularAttribute<Expedienteproceso, Oferente> nombreadjudicatario;
    public static volatile CollectionAttribute<Expedienteproceso, Oferta> ofertaCollection;

}