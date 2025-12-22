package ma.fsr.tp1.cabinetmedical.web;

import lombok.AllArgsConstructor;
import ma.fsr.tp1.cabinetmedical.dto.CreateRendezVousRequest;
import ma.fsr.tp1.cabinetmedical.model.RendezVous;
import ma.fsr.tp1.cabinetmedical.service.RendezVousService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rendezvous")
@AllArgsConstructor
public class RendezVousController {

    public final RendezVousService rendezVousService;

    @PostMapping
    public RendezVous create(@RequestBody CreateRendezVousRequest request) {
        return rendezVousService.createRendezVous(
            request.getDateRdv(),
            request.getPatientId(),
            request.getMedecinId()
        );
    }

    @GetMapping
    public List<RendezVous> getAll(){ return rendezVousService.listRendezVous(); }
}
