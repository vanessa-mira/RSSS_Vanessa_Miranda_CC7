package mx.edu.utez.RSSS_Vanessa_Miranda_CC7.repository;


import jakarta.persistence.metamodel.SingularAttribute;
import mx.edu.utez.RSSS_Vanessa_Miranda_CC7.model.Vehiculo;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehiculoRepository extends JpaRepository<Vehiculo,Long> {

}
