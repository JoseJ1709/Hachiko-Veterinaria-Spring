package com.example.demo.servicio;

import com.example.demo.entidades.Droga;
import com.example.demo.repositorio.DrogasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;



@Service
public class DrogaServiceImpl implements DrogaService {
    @Autowired
    private DrogasRepository drogaRepository;

    @Override
    public Droga findById(Long id) {
        return drogaRepository.findById(id).get();
    }

    @Override
    public List<Droga> findAll() {
        return drogaRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        drogaRepository.deleteById(id);
    }

    @Override
    public Droga update(Droga droga) {
        return drogaRepository.save(droga);
    }

    @Override
    public void add(Droga droga) {
        drogaRepository.save(droga);
    }

    @Override
    public void cargarDrogras() throws IOException {
    ClassPathResource resource = new ClassPathResource("static/MEDICAMENTOS_VETERINARIA.xlsx");
    List<Droga> listaDrogas = new ArrayList<>();
    Sheet sheet;

    try (InputStream file = resource.getInputStream()) {
        Workbook workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheetAt(0);
    

      for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
        Row row = sheet.getRow(i);

        String nombre = row.getCell(0).getStringCellValue();
        int precioVenta = (int) row.getCell(1).getNumericCellValue();
        int precioCompra = (int) row.getCell(2).getNumericCellValue();
        int unidadesDisponibles = (int) row.getCell(3).getNumericCellValue();
        int unidadesVendidas = (int) row.getCell(4).getNumericCellValue();

        Droga droga = new Droga(nombre, precioCompra, precioVenta, unidadesDisponibles, unidadesVendidas);
        listaDrogas.add(droga);
      }

      drogaRepository.saveAll(listaDrogas);
      workbook.close();
      file.close();
    }
}

}
