package com.example.terramodusvtll.repositories.devisSte;
import com.example.terramodusvtll.entities.devisSte.DevisSteDigital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisSteDigitalRepository extends JpaRepository<DevisSteDigital,Long> {

}
