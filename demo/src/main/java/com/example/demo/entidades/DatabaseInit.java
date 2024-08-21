package com.example.demo.entidades;

import com.example.demo.repositorio.ClientesRepository;
import com.example.demo.repositorio.MascotasRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

@Controller
@Transactional
public class DatabaseInit implements ApplicationRunner {

    @Autowired
    MascotasRepository mascotasRepository;

    @Autowired
    ClientesRepository clientesRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        mascotasRepository.save(new Mascota("Juan","Firulais","Pastor Aleman",5,20,"Ning",true,0,"dog1.jpg"));
        mascotasRepository.save(new Mascota("Pedro","Rex","Bulldog",3,15,"Ning",true,0,"dog2.jpg"));
        mascotasRepository.save(new Mascota("Maria","Luna","Poodle",2,10,"Ning",true,0,"dog3.jpg"));
        mascotasRepository.save(new Mascota("Ana","Toby","Labrador",4,25,"Ning",true,0,"dog4.jpg"));
        mascotasRepository.save(new Mascota("Jose","Max","Golden Retriever",6,30,"Ning",true,0,"dog5.jpg"));

        clientesRepository.save(new Cliente(1023242547,"Juan","juan@gmail.com",310254334));
        clientesRepository.save(new Cliente(1023242548,"Pedro","pedro@gmail", 310254335));
        clientesRepository.save(new Cliente(1023242549,"Maria","maria@gmail",310254336));
        clientesRepository.save(new Cliente(1023242550,"Ana","ana@gmail",310254337));
        clientesRepository.save(new Cliente(1023242551,"Jose","jose@gmail",310254338));
    }

}
