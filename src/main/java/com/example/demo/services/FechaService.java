package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.fechasModel;
import com.example.demo.repositories.FechaRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class FechaService {
    @Autowired
    FechaRepository fechaRepository;

    public ArrayList<fechasModel> obtenerFechas(){
        return (ArrayList<fechasModel>)fechaRepository.findAll();
    }

    public fechasModel guardarFecha(fechasModel myFecha){
        return fechaRepository.save(myFecha);
    }

    public Optional<fechasModel> optenerFechaPorId(Long idfecha){
        return fechaRepository.findById(idfecha);
    }

    public boolean eliminarFecha(Long id){
        try {
            fechaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
