package com.example.minhasnotas;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UsuarioDao {

    @Insert
    void inserir(Usuario usuario);
    @Delete
    void deletar(Usuario usuario);
    @Query("SELECT * FROM Usuario")
    List<Usuario> listarTodos();
    @Update
    void atualizar(Usuario usuario);
}
