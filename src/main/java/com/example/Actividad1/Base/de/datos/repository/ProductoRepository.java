package com.example.Actividad1.Base.de.datos.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Actividad1.Base.de.datos.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
