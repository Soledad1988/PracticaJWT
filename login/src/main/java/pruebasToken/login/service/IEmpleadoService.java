package pruebasToken.login.service;

import java.util.List;

import pruebasToken.login.model.Empleado;

public interface IEmpleadoService {

	public List<Empleado> verEmpleado();
    public void crearEmpleado(Empleado empleado);
    public void borrarEmpleado(Integer id);
    public Empleado buscarEmpleado(Integer id);
    public void actualizar(Empleado empleado);
}
