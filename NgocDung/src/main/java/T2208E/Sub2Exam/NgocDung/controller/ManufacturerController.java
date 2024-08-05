package T2208E.Sub2Exam.NgocDung.controller;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqManufacturer.ReqCreateManufacturerDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqManufacturer.ReqUpdateManufacturerDto;
import T2208E.Sub2Exam.NgocDung.service.ManufacturerService.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/manufacturer")
public class ManufacturerController {
    @Autowired
    ManufacturerService manufacturerService;

    @GetMapping("/getAllManufacturer")
    public ResponseEntity<?> getAllManufacturer() {
        return ResponseEntity.ok(manufacturerService.getAllManufacturer());
    }
    @PostMapping("/createManufacturer")
    public ResponseEntity<?> createManufacturer(@RequestBody ReqCreateManufacturerDto inputDto) {
        return ResponseEntity.ok(manufacturerService.createManufacturer(inputDto));
    }
    @PutMapping("/updateManufacturer")
    public ResponseEntity<?> updateManufacturer(@RequestBody ReqUpdateManufacturerDto inputDto, Long id) {
        return ResponseEntity.ok(manufacturerService.updateManufacturer(inputDto, id));
    }
    @DeleteMapping("/deleteManufacturer")
    public ResponseEntity<?> deleteManufacturer(@RequestParam Long id) {
        return ResponseEntity.ok(manufacturerService.deleteManufacturer(id));
    }
}
