/**
 * 
 */
package bce.fin.com.behavior;

import bce.fin.com.ec.Estudiante;

/**
 * @author rubin
 *
 */
public class EdadEstudiante implements PredicadoEstudiante {

	@Override
	public boolean filtrar(Estudiante est) {
		
		return est.getEdadEst() >18;
	}

}
