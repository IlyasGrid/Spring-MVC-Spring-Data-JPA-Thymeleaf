package enset.ilyasgrid.patient_manger;

import enset.ilyasgrid.patient_manger.entities.Patient;
import enset.ilyasgrid.patient_manger.respository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PatientMangerApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(PatientMangerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Patient p1 = new Patient(null, "Ilyas", new Date(), true, 20);
        Patient p2 = Patient.builder()
                .name("Simo")
                .birthDate(new Date())
                .sick(false)
                .score(120)
                .build();

        patientRepository.save(p1);
        patientRepository.save(p2);
    }


}
