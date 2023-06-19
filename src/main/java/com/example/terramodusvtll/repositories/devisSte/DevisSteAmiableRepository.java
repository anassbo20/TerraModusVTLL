package com.example.terramodusvtll.repositories.devisSte;
import com.example.terramodusvtll.entities.devisSte.DevisSteAmiable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisSteAmiableRepository extends JpaRepository<DevisSteAmiable,Long> {

}
