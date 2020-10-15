package mx.com.kene.microservicios.app.usuarios.services;

import org.springframework.stereotype.Service;

import mx.com.kene.microservicios.app.usuarios.models.entity.Alumno;
import mx.com.kene.microservicios.app.usuarios.models.repository.AlumnoRepository;
import mx.com.kene.microservicios.commons.services.CommonServiceImpl;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {


}
