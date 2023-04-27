package com.example.minhasnotas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.minhasnotas.databinding.FragmentPrincipalBinding;

import java.util.ArrayList;

public class PrincipalFragment extends Fragment {

    FragmentPrincipalBinding principalBinding;
    UsuarioDao usuarioDao;
    ArrayList<Usuario> usuarios;
    EditText nomeText;

    public PrincipalFragment() {
        super(R.layout.fragment_principal);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        principalBinding = FragmentPrincipalBinding.inflate(inflater, container, false);
        return principalBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        usuarioDao = DatabaseSingleton.getInstance(getContext()).appDatabase.usuarioDao();
        usuarios = (ArrayList<Usuario>) usuarioDao.listarTodos();

        //principalBinding.botaoCriar.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.cadastroFragment, null));

        principalBinding.botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String telaCampoNome = principalBinding.campoNome.toString();

                for(Usuario usuario: usuarios){

                }

            }
        });


    }
}