package com.example.minhasnotas;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Usuario {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo
    String nome;

    public Usuario(String nome){
        this.nome = nome;
    }
}
