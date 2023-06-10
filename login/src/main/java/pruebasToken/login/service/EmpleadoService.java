package pruebasToken.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pruebasToken.login.model.Empleado;
import pruebasToken.login.repository.EmpleadoRepository;

@Service
public class EmpleadoService implements IEmpleadoService{

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	
	@Override
	public List<Empleado> verEmpleado() {
		return empleadoRepository.findAll();
	}

	@Override
	public void crearEmpleado(Empleado empleado) {
		empleadoRepository.save(empleado);
		
	}

	@Override
	public void borrarEmpleado(Integer id) {
		empleadoRepository.deleteById(id);
		
	}

	@Override
	public Empleado buscarEmpleado(Integer id) {
		return empleadoRepository.findById(id).orElse(null);
	}

	@Override
	public void actualizar(Empleado empleado) {
		empleadoRepository.save(empleado);
		
	}
}
