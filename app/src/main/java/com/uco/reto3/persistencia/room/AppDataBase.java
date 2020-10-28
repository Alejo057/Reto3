package com.uco.reto3.persistencia.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.uco.reto3.entidades.Movimiento;
import com.uco.reto3.entidades.Tarifa;
import com.uco.reto3.persistencia.dao.TarifaDAO;

@Database(entities = {Tarifa.class, Movimiento.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TarifaDAO userDao();
}
