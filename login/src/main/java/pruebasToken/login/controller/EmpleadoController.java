package pruebasToken.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pruebasToken.login.model.Empleado;
import pruebasToken.login.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	@PostMapping
    public void agregarEmpleado(@RequestBody Empleado empleado){
		empleadoService.crearEmpleado(empleado);
    }
    
    @GetMapping
    @ResponseBody
    public List<Empleado> verEmpleado (){
       return empleadoService.verEmpleado();
    }
    
    @GetMapping("/{id}")
    public Empleado get(@PathVariable("id") Integer id){
       return empleadoService.buscarEmpleado(id);
    }
   
	 @DeleteMapping("/{id}")
	 void borrarEmpleado(@PathVariable Integer id){
		 empleadoService.borrarEmpleado(id);
	 }
  
  
	  @PutMapping
	  public void actualizar(@RequestBody Empleado empleado){
		  empleadoService.actualizar(empleado);
	  }
}
