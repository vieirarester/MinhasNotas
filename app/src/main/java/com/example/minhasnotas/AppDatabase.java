package com.example.minhasnotas;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Nota.class, Usuario.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {

    public abstract NotaDao notaDao();
    public abstract UsuarioDao usuarioDao();
}
