package com.example.demo.service;

import com.example.demo.entidades.Droga;
import com.example.demo.entidades.Tratamiento;
import com.example.demo.repositorio.TratamientosRepository;
import com.example.demo.servicio.TratamientoServiceImpl;
import com.example.demo.servicio.DrogaService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TratamientoServiceTestMock {

  @Mock
  private TratamientosRepository tratamientosRepository;

  @Mock
  private DrogaService drogaService;

  @InjectMocks
  private TratamientoServiceImpl tratamientoService;


}
