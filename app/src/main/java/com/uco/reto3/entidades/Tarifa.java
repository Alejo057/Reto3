package com.uco.reto3.entidades;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.uco.reto3.persistencia.Tabla;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(tableName = Tabla.TARIFA)
public class Tarifa {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "idTarifa")
    private Integer idTarifa;
    @ColumnInfo(name = "nombre")
    private String nombre;
    @ColumnInfo(name = "precio")
    private double precio;

    public Tarifa() {
    }

    @NonNull
    public Integer getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(@NonNull Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
