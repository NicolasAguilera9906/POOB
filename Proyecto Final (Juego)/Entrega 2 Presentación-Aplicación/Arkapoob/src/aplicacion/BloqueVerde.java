package aplicacion;

import java.awt.Color;
import java.awt.geom.*;

public class BloqueVerde extends Bloque {
	/**
	 * Clase que ejecuta el bloque verde del juego arkapoob
	 * @author: Nicolas Aguilera y Daniel Walteros
	 * @version: 25/04/2019
	*/
	/**
     * Constructor para la clase bloque
	 * @param x La coordenada horizontal del bloque.
	 * @param y La coordenada vertical del bloque.
	 * @param anchoB El ancho del bloque.
	 * @param altoB La altura del bloque.
    */
	public BloqueVerde(int x , int y , int ancho , int alto) {
		super(x, y, ancho, alto);
		puntaje = 200;
		lives=2;
	}
	/**
     * Obtiene el color del bloque
     * @return El color del bloque.
    */
	public Color getColor() {
		return Color.GREEN;
	}
}