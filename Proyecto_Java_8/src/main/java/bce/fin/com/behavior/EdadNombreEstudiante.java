/**
 * 
 */
package bce.fin.com.behavior;

import bce.fin.com.ec.Estudiante;

/**
 * @author rubin
 *
 */
public class EdadNombreEstudiante implements PredicadoEstudiante {

	@Override
	public boolean filtrar(Estudiante est) {
		
		return est.getEdadEst() >18 && est.getNombreEst().startsWith("G");
	}

}
