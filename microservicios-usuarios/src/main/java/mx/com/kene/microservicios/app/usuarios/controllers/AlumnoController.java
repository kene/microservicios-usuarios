package mx.com.kene.microservicios.app.usuarios.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.kene.microservicios.app.usuarios.models.entity.Alumno;
import mx.com.kene.microservicios.app.usuarios.services.AlumnoService;
import mx.com.kene.microservicios.commons.controllers.CommonController;

@RestController
public class AlumnoController extends CommonController<Alumno, AlumnoService>{
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id){
		Optional<Alumno> o = service.findById(id);
		
		if(!o.isPresent()) {
			return ResponseEntity.notFound().build(); //404
		}
		
		
		Alumno alumnoDb = o.get();
		alumnoDb.setNombre(alumno.getNombre());
		alumnoDb.setApellido(alumno.getApellido());
		alumnoDb.setEmail(alumno.getEmail());
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoDb)); // 201
	}
		
	
}
