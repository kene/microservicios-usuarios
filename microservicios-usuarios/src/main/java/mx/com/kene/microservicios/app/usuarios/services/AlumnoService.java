package mx.com.kene.microservicios.app.usuarios.services;

import java.util.Optional;

import mx.com.kene.microservicios.app.usuarios.models.entity.Alumno;

public interface AlumnoService{

	
	public Iterable<Alumno> findAll();
	
	public Optional<Alumno> findById(Long id);
	
	
	public Alumno save(Alumno alumno);
	
	public void deleteById(Long id);
	
	
}
