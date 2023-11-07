package adn.arus.service.validator;

public class Validador {

	private static final String LETRAS_REGEX = "^[a-zA-ZáéíóúüÁÉÍÓÚÜñÑ]+$";

	private static final String MENSAJE_CONDICION_CC = "El campo 'Número de documento' solo puede contener números y un máximo de 10 caracteres";
	private static final String REGEX_CC = "[0-9]{1,10}";

	private static final String MENSAJE_CONDICION_CE = "El campo 'Número de documento' puede contener números y letras, y un máximo de 14 caracteres";
	private static final String REGEX_CE = "[0-9a-zA-Z]{1,14}";

	private static final String MENSAJE_CONDICION_RC = "El campo 'Número de documento' solo puede contener números";
	private static final String REGEX_RC = "[0-9]{1,}";

	private static final String MENSAJE_CONDICION_TI = "El campo 'Número de documento' solo puede contener números";
	private static final String REGEX_TI = "[0-9]{1,}";

	private static final String MENSAJE_DEFAULT = "No se pudo obtener el tipo de documento. ";
	private static final String MENSAJE_DOCUMENTO_VACIO = "El numero de documento está vacío";

	public Boolean soloTexto(String textoValidar) {
		return textoValidar != null && textoValidar.matches(LETRAS_REGEX);

	}

	public String tipoDocumento(String tipoDocumento, String numeroDocumento) {
		String respuesta = "";

		switch (tipoDocumento) {
		case "CC":
			if (!numeroDocumento.matches(REGEX_CC)) {
				respuesta = MENSAJE_CONDICION_CC;
			}
			break;
		case "CE":
			if (!numeroDocumento.matches(REGEX_CE)) {
				respuesta = MENSAJE_CONDICION_CE;
			}
			break;
		case "RC":
			if (!numeroDocumento.matches(REGEX_RC)) {
				respuesta = MENSAJE_CONDICION_RC;
			}
			break;
		case "TI":
			if (!numeroDocumento.matches(REGEX_TI)) {
				respuesta = MENSAJE_CONDICION_TI;
			}
			break;
		default:
			respuesta = MENSAJE_DEFAULT;
		}
		if (numeroDocumento.isEmpty()) {
			respuesta = MENSAJE_DOCUMENTO_VACIO;
		}
		return respuesta;
	}

}
