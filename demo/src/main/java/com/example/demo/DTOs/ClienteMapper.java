package com.example.demo.DTOs;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.entidades.Cliente;

@Mapper
public interface ClienteMapper {

    VeterinarioMapper INSTANCE = Mappers.getMapper(VeterinarioMapper.class);


    VeterinarioDTO convert(Cliente veterinario);
}
