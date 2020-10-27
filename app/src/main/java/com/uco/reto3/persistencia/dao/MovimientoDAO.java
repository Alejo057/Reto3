package com.uco.reto3.persistencia.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.uco.reto3.entidades.Movimiento;

@Dao
public interface MovimientoDAO {

    @Query("SELECT * FROM MOVIMIENTO Where placa=:placa AND finalizaMovimiento = 0")
    Movimiento findByPLaca(String placa);

    @Insert
    void insert(Movimiento movimiento);
}
