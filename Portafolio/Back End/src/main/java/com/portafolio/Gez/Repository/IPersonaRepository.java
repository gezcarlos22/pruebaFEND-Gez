
package com.portafolio.Gez.Repository;

import com.portafolio.Gez.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona,Long> {
    
}
