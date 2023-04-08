package ro.online.store.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.online.store.dto.ManufacturerDTO;
import ro.online.store.dto.ManufacturerInfoDTO;
import ro.online.store.service.ManufacturerService;

@RestController
@RequestMapping("/api/manufacturer")
@ControllerAdvice
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @PostMapping
    public ResponseEntity<ManufacturerInfoDTO> saveManufacturer(@RequestBody @Valid ManufacturerDTO manufacturerDTO){
        return ResponseEntity.ok(manufacturerService.createManufacturer(manufacturerDTO));
    }


}
