package Modelo;

import Modelo.Datosinstitucionales;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-12T18:14:48")
@StaticMetamodel(Ordencompra.class)
public class Ordencompra_ { 

    public static volatile SingularAttribute<Ordencompra, Date> fechaentrega;
    public static volatile SingularAttribute<Ordencompra, Date> fecha;
    public static volatile SingularAttribute<Ordencompra, String> nombresuministrante;
    public static volatile SingularAttribute<Ordencompra, String> totalletras;
    public static volatile SingularAttribute<Ordencompra, String> observaciones;
    public static volatile SingularAttribute<Ordencompra, String> nitsuministrante;
    public static volatile SingularAttribute<Ordencompra, String> emailadminorden;
    public static volatile SingularAttribute<Ordencompra, Datosinstitucionales> codigoinstitucion;
    public static volatile SingularAttribute<Ordencompra, Integer> noorden;
    public static volatile SingularAttribute<Ordencompra, String> teladminorden;
    public static volatile SingularAttribute<Ordencompra, String> nombreadminorden;
    public static volatile SingularAttribute<Ordencompra, BigDecimal> montototal;
    public static volatile SingularAttribute<Ordencompra, String> direccionsuministrante;
    public static volatile SingularAttribute<Ordencompra, String> lugarentrega;

}