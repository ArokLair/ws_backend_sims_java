package com.sims.simsplanning.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sims.simsplanning.model.RecepcionProveedorPesca;

@Repository
public interface  RecepcionProveedorPescaRepository extends JpaRepository<RecepcionProveedorPesca, Long> {

}
