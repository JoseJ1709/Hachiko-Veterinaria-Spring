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
        Cliente clienteJuan = clientesRepository.save(new Cliente(1023242547, "Juan", "juan@gmail.com", 310254334));
        Cliente clientePedro = clientesRepository.save(new Cliente(1023242548, "Pedro", "pedro@gmail.com", 310254335));
        Cliente clienteMaria = clientesRepository.save(new Cliente(1023242549, "Maria", "maria@gmail.com", 310254336));
        Cliente clienteAna = clientesRepository.save(new Cliente(1023242550, "Ana", "ana@gmail.com", 310254337));
        Cliente clienteJose = clientesRepository.save(new Cliente(1023242551, "Jose", "jose@gmail.com", 310254338));


        Mascota mascota1 = new Mascota(clienteJuan.getNombre(), "Firulais", "Pastor Aleman", 5, 20, "Ning", true, 0, "dog1.jpg");
        mascota1.setCliente(clienteJuan);
        mascotasRepository.save(mascota1);

        Mascota mascota2 = new Mascota(clientePedro.getNombre(), "Rex", "Bulldog", 3, 15, "Ning", true, 0, "dog2.jpg");
        mascota2.setCliente(clientePedro);
        mascotasRepository.save(mascota2);

        Mascota mascota3 = new Mascota(clienteMaria.getNombre(), "Luna", "Poodle", 2, 10, "Ning", true, 0, "dog3.jpg");
        mascota3.setCliente(clienteMaria);
        mascotasRepository.save(mascota3);

        Mascota mascota4 = new Mascota(clienteAna.getNombre(), "Toby", "Labrador", 4, 25, "Ning", true, 0, "dog4.jpg");
        mascota4.setCliente(clienteAna);
        mascotasRepository.save(mascota4);

        Mascota mascota5 = new Mascota(clienteJose.getNombre(), "Max", "Golden Retriever", 6, 30, "Ning", true, 0, "dog5.jpg");
        mascota5.setCliente(clienteJose);
        mascotasRepository.save(mascota5);

    }

}
