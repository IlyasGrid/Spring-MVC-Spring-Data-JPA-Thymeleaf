package enset.ilyasgrid.patient_manger.respository;

import enset.ilyasgrid.patient_manger.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  PatientRepository extends JpaRepository<Patient,Long> {
}

