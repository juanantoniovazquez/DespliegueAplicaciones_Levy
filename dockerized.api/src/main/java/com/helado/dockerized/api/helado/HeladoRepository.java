package com.helado.dockerized.api.helado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeladoRepository extends JpaRepository<Helado, Long>{    
    
}
