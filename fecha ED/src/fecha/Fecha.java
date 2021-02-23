/**
*
*/
package fecha;

/**
 * @author Manuel Capilla Jimenez
 *
 */
public class Fecha {

	//Estos son los datos principales para usar el programa
	public int dia;
	public int mes;
	public int anio;
	
	//Aqui empezamos a usar el constructor para meter los atributos en un entero
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	//Aqui nos devolvera el valor de la validacion de fecha
	public boolean valida() {

		return validarFecha();

	}

	//En este proceso validamos si lo que se esta introduciendo es un valor coherente
	public boolean validarFecha() {
		if (dia < 1 || dia > 31)
			return false;
		if (mes < 1 || mes > 12)
			return false;

		// Determinamos la cantidad de días del mes:
		int diasMes = 0;
		
		//Aqui se ubican los meses que acaban en dia 31 
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasMes = 31;
			break;
		
		//Aqui se ubican los meses que acaban en dia 30 
		case 4:
		case 6:
		case 9:
		case 11:
			diasMes = 30;
			break;
			
		//Aqui nos saldra el valor de la verificacion del proceso "bisiesto()"
		case 2: 
			diasMes = bisiesto();
			break;

		}
		
		//En este apartado confirmamos si el dia es valido con el mes elegido
		if (dia > diasMes)
			return false;
		else
			return true;
	}

	//Y aqui se valida si el mes de Febrero es bisiesto o no
	public int bisiesto() {
		int diasMes;
		if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0)))
			diasMes = 29;
		else
			diasMes = 28;
		return diasMes;
	}

}