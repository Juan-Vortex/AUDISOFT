package com.example.demo.Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelos.productoModel;

@Repository
public interface productoRepository extends CrudRepository<productoModel, Long> {

}
