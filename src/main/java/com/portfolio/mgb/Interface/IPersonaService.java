package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Trae una lista de Personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto Persona buscandolo con ID
    public void deletePersona(Long id);
    
    //Buscar Persona por ID
    public Persona indPersona(Long id);

    public Persona findPersona(Long id);
}
