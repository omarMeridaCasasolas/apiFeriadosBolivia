package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.fechasModel;

@Repository
public interface FechaRepository extends CrudRepository<fechasModel, Long>{
    public abstract ArrayList<fechasModel> getIDFecha(Integer idfecha);
}
