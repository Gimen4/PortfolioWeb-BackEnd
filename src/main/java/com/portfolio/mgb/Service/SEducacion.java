/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Entity.Educacion;
import com.portfolio.mgb.Repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired
        REducacion rEducaion;
    
    public List<Educacion> list(){
        return rEducaion.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return rEducaion.findById(id);
    }
    
    public Optional<Educacion> getByNombreE(String nombreE){
        return rEducaion.findByNombreE(nombreE);
    }
    
    public void save(Educacion educacion){
        rEducaion.save(educacion);
    }
    
     public void delete(int id){
        rEducaion.deleteById(id);
    }
     
     public boolean existsById(int id){
         return rEducaion.existsById(id);
     }
     
     public boolean existsByNombreE(String nombreE){
         return rEducaion.existsByNombreE(nombreE);
     }
}
