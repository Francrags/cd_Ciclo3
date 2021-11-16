
package tutoria.domingo.interfaces;

import org.springframework.data.repository.CrudRepository;
import tutoria.domingo.modelo.Mensaje;

/**
 *
 * @author RUBEN GIRALDO
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
