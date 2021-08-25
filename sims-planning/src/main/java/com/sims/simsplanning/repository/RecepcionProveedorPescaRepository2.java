package com.sims.simsplanning.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sims.simsplanning.model.RecepcionProveedorPesca;

@Repository
public interface  RecepcionProveedorPescaRepository2 extends JpaRepository<RecepcionProveedorPesca, Long> {
	 @Query(value="select * from recepcion_proveedor_pesca", nativeQuery=true)
	    List<RecepcionProveedorPesca> getAuthorsByFirstName();
	 
	 
}
