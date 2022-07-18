package com.example.demo.models;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="fechas")
public class fechasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id_fecha;
    private Date fecha;

    public void SetId_fecha(int idFecha){
        id_fecha = idFecha;
    }
    public void SetFecha(Date fecha){
        this.fecha = fecha;
    }

    public long getIDFecha(){
        return id_fecha;
    }

    public Date getFecha(){ 
        return fecha;
    }

}
