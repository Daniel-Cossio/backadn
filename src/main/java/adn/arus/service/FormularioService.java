package adn.arus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adn.arus.model.Formulario;
import adn.arus.repository.FormularioRepository;
import adn.arus.service.validator.Validador;



@Service
public class FormularioService {
	
	private static final String MENSAJE_GUARDADO = "Registro exitoso";

	private static final String MENSAJE_SOLO_LETRAS = "Los campos de nombres y apellidos solo pueden contener letras";
	@Autowired
	private FormularioRepository formularioRepository;
	
	public String save(Formulario formulario) {
		Validador validador = new Validador();
		
		Boolean validoSoloTexto = validador.soloTexto(formulario.getPrimerNombre())
				&& validador.soloTexto(formulario.getSegundoNombre())
				&& validador.soloTexto(formulario.getPrimerApellido())
				&& validador.soloTexto(formulario.getSegundoApellido());
		String validoTipoDocumento = validador.tipoDocumento(formulario.getTipoDocumento(),
				formulario.getNumeroDocumento());
		if(validoSoloTexto && validoTipoDocumento.isEmpty()) {
			formularioRepository.save(formulario);
			return MENSAJE_GUARDADO;
		}else if(!validoSoloTexto){
			return MENSAJE_SOLO_LETRAS;
		}else{
			return validoTipoDocumento;
		}
	}
}
