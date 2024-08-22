package com.example.demo.repositorio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entidades.Mascota;

@Repository
public interface MascotasRepository extends JpaRepository<Mascota, Long> {

<<<<<<< HEAD
    public Mascota findById(int id){
        return data.get(id);
    }
    public Collection<Mascota> findAll(){
        return data.values();
    }

    //metodos
    public void deleteById(int id){
        data.remove(id);
    }

    public void update(Student student){
        data.put(Student.getId(), Student);
    }

    public void add(Student student){
        int tam = data.size();
        int lastId = data.getId();
        student.setId(lastId+1);
        data.put(student.getId, student);
        
    }
=======
>>>>>>> fb36fbfb94ff087d679864ef87cc01c2fda56523
}
