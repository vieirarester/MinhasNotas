package com.example.minhasnotas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.minhasnotas.databinding.FragmentCadastroBinding;

public class CadastroFragment extends Fragment {

    FragmentCadastroBinding cadastroBinding;
    UsuarioDao usuarioDao;

    public CadastroFragment() {
        super(R.layout.fragment_cadastro);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        cadastroBinding = FragmentCadastroBinding.inflate(inflater, container, false);

        usuarioDao = DatabaseSingleton.getInstance(getContext()).appDatabase.usuarioDao();

        return cadastroBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cadastroBinding.botaoSalvarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = cadastroBinding.editTextNome.toString();

                Usuario usuario = new Usuario(nome);
                usuarioDao.inserir(usuario);

                //Navigation.findNavController(view).navigate(R.id.loginFragment);
            }
        });

    }
}