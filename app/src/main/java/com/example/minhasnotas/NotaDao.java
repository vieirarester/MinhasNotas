package com.example.minhasnotas;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NotaDao {

    @Insert
    void inserir(Nota nota);
    @Delete
    void deletar(Nota nota);
    @Query("DELETE FROM Nota")
    void deletarTodos();
    @Query("SELECT * FROM Nota")
    List<Nota> listarTodos();
    @Update
    void atualizar(Nota nota);

}
