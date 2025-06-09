package enset.ilyasgrid.patient_manger.web;

import enset.ilyasgrid.patient_manger.entities.Patient;
import enset.ilyasgrid.patient_manger.respository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller 
@AllArgsConstructor
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/index")
    public String index(Model model) {
        List<Patient> patientList = patientRepository.findAll();
        model.addAttribute("patientList", patientList);
        return "index";
    }
}
