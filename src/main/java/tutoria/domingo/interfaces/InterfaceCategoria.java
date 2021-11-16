
package tutoria.domingo.interfaces;

import org.springframework.data.repository.CrudRepository;
import tutoria.domingo.modelo.Categoria;

/**
 *
 * @author RUBEN GIRALDO
 */
public interface InterfaceCategoria extends CrudRepository<Categoria,Integer> {
    
}
