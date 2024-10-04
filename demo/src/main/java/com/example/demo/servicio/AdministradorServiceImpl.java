package com.example.demo.servicio;

import com.example.demo.repositorio.AdministradoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServiceImpl implements AdministradorService {
    @Autowired
    private AdministradoresRepository administradoresRepository;

    @Override
    public boolean login(String usuario, String password) {
        return administradoresRepository.findByUsuarioAndPassword(usuario, password) != null;
    }
}
