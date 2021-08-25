package com.sims.simsplanning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sims.simsplanning.repository.RecepcionProveedorPescaRepository2;

import javassist.NotFoundException;

import com.sims.simsplanning.exception.ResourceNotFoundException;
import com.sims.simsplanning.model.RecepcionProveedorPesca;


@RestController
@RequestMapping("/")
public class RecepcionProveedorPescaController {

	@Autowired
    private RecepcionProveedorPescaRepository2 recepcionProveedorPescaRepository;
	
	
	 @RequestMapping("/proveedores")
	    public List<RecepcionProveedorPesca> getAllProveedores() {
	  
		 return recepcionProveedorPescaRepository.findAll();
	        
	        
	    }
	
	 
	 @GetMapping("/proveedores/{id}")
	    public ResponseEntity<RecepcionProveedorPesca> getEmployeeById(@PathVariable(value = "id") Long proveedorId)
	        throws ResourceNotFoundException  {
		 RecepcionProveedorPesca proveedores = recepcionProveedorPescaRepository.findById(proveedorId)
	          .orElseThrow(() -> new ResourceNotFoundException ("Employee not found for this id :: " + proveedorId));
	        return ResponseEntity.ok().body(proveedores);
	    }
	
}
