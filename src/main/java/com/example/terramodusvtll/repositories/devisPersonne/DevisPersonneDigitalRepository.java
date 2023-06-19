package com.example.terramodusvtll.repositories.devisPersonne;
import com.example.terramodusvtll.entities.devisPersonne.DevisPersonneDigital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisPersonneDigitalRepository extends JpaRepository<DevisPersonneDigital,Long> {

}
