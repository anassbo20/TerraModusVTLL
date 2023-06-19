package com.example.terramodusvtll.repositories;
import com.example.terramodusvtll.entities.Immob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImmobRepository extends JpaRepository<Immob,Long> {
}
