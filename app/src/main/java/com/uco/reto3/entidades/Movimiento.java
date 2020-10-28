package com.uco.reto3.entidades;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.uco.reto3.persistencia.Tabla;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(tableName = Tabla.MOVIMIENTO)
public class Movimiento {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "idMovimiento")
    private Integer idMovimiento;

    @ColumnInfo(name = "idTarifa")
    private Integer idTarifa;

    @ColumnInfo(name = "placa")
    private String placa;

    @ColumnInfo(name = "fechaEntrada")
    private String fechaEntrada;

    @ColumnInfo(name = "fechaSalida")
    private String fechaSalida;

    @ColumnInfo(name = "finalizaMovimiento")
    private boolean finalizaMovimiento;

    public Movimiento() {
    }

    @NonNull
    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(@NonNull Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Integer getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public boolean isFinalizaMovimiento() {
        return finalizaMovimiento;
    }

    public void setFinalizaMovimiento(boolean finalizaMovimiento) {
        this.finalizaMovimiento = finalizaMovimiento;
    }
}
