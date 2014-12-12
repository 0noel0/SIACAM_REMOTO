package Modelo;

import Modelo.Empleado;
import Modelo.Rol;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-12-11T21:34:29")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Integer> iduser;
    public static volatile SingularAttribute<Usuario, String> estadouser;
    public static volatile SingularAttribute<Usuario, Rol> idrol;
    public static volatile SingularAttribute<Usuario, Date> fechauser;
    public static volatile CollectionAttribute<Usuario, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Usuario, String> nombreuser;
    public static volatile SingularAttribute<Usuario, String> passworduser;

}