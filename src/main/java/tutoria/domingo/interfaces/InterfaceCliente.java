
package tutoria.domingo.interfaces;

import org.springframework.data.repository.CrudRepository;
import tutoria.domingo.modelo.Cliente;

/**
 *
 * @author RUBEN GIRALDO
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer>{
    
}
