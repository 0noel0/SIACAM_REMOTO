package Modelo;

import Modelo.Listadonecesipaac;
import Modelo.Ordencompra;
import Modelo.Paac;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-12T18:14:48")
@StaticMetamodel(Datosinstitucionales.class)
public class Datosinstitucionales_ { 

    public static volatile CollectionAttribute<Datosinstitucionales, Listadonecesipaac> listadonecesipaacCollection;
    public static volatile SingularAttribute<Datosinstitucionales, String> codigoinstitucion;
    public static volatile SingularAttribute<Datosinstitucionales, String> direccioninstitucion;
    public static volatile CollectionAttribute<Datosinstitucionales, Ordencompra> ordencompraCollection;
    public static volatile CollectionAttribute<Datosinstitucionales, Paac> paacCollection;
    public static volatile SingularAttribute<Datosinstitucionales, String> nombreinstitucion;

}