package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.fechasModel;
import com.example.demo.services.FechaService;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/fechas")
public class fechasController {
    @Autowired
    FechaService fechaService;

    @GetMapping
    public ArrayList<fechasModel> obtenerFechas(){
        return fechaService.obtenerFechas();
    }
    @PostMapping
    public fechasModel guardarFecha(@RequestBody fechasModel myFechaModel){
        return this.fechaService.guardarFecha(myFechaModel);
    }
    @GetMapping(path ="/{id}")
    public Optional<fechasModel> obtenerFechaPorID(@PathVariable("id") Long id){
        return this.fechaService.optenerFechaPorId(id);
    }
    @DeleteMapping( path ="/{id}")
    public String eliminarPorID(@PathVariable("id") Long id){
        boolean resp = this.fechaService.eliminarFecha(id);
        if(resp){
            return "Se elimino el registro con el id "+id;
        }else{
            return "problemas al eliminar registro";
        }
    }
}
