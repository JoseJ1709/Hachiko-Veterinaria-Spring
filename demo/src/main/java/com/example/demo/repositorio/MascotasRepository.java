package com.example.demo.repositorio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.example.demo.entidades.Mascota;

@Repository
public class MascotasRepository {
    private Map<Integer,Mascota> data = new HashMap<>();
    public MascotasRepository() {
        data.put(1, new Mascota(1,"Juan", "Firulais", "Labrador", 5, 20, "Ninguna", true, 0, "dog1.jpg"));
        data.put(2, new Mascota(2,"Maria", "Rex", "Pastor Alemán", 3, 25, "Ninguna", true, 0, "dog2.jpg"));
        data.put(3, new Mascota(3,"Pedro", "Bobby", "Beagle", 4, 15, "Alergia", true, 1, "dog3.jpg"));
        data.put(4, new Mascota(4,"Ana", "Luna", "Golden Retriever", 2, 30, "Ninguna", true, 0, "dog4.jpg"));
        data.put(5, new Mascota(5,"Luis", "Max", "Bulldog", 6, 22, "Artritis", true, 2, "dog5.jpg"));
    }

    public Mascota findById(int id){
        return data.get(id);
    }
    public Collection<Mascota> findAll(){
        return data.values();
    }
}
