package ma.fsr.tp1.cabinetmedical.service;

import lombok.AllArgsConstructor;
import ma.fsr.tp1.cabinetmedical.model.Medecin;
import ma.fsr.tp1.cabinetmedical.model.Patient;
import ma.fsr.tp1.cabinetmedical.model.RendezVous;
import ma.fsr.tp1.cabinetmedical.repository.MedecinRepository;
import ma.fsr.tp1.cabinetmedical.repository.PatientRepository;
import ma.fsr.tp1.cabinetmedical.repository.RendezVousRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class RendezVousService {

    private final RendezVousRepository repo;
    private final PatientRepository patientRepository;
    private final MedecinRepository medecinRepository;

    public RendezVous createRendezVous(LocalDate dateRdv, Long patientId, Long medecinId) {
        if (dateRdv == null) {
            throw new IllegalArgumentException("La date du rendez-vous est obligatoire.");
        }
        if (patientId == null) {
            throw new IllegalArgumentException("L'ID du patient est obligatoire.");
        }
        if (medecinId == null) {
            throw new IllegalArgumentException("L'ID du médecin est obligatoire.");
        }

        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new IllegalArgumentException("Patient avec l'ID " + patientId + " n'existe pas."));

        Medecin medecin = medecinRepository.findById(medecinId)
                .orElseThrow(() -> new IllegalArgumentException("Médecin avec l'ID " + medecinId + " n'existe pas."));

        // Automatically set status to "EN_ATTENTE" for new appointments
        RendezVous rdv = new RendezVous(null, dateRdv, "EN_ATTENTE", patient, medecin);

        return repo.save(rdv);
    }

    public List<RendezVous> listRendezVous() { return repo.findAll(); }
}
