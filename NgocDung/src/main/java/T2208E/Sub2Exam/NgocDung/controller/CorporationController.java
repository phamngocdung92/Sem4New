package T2208E.Sub2Exam.NgocDung.controller;

import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResCorporation.ResGetCorpDetail;
import T2208E.Sub2Exam.NgocDung.service.CorporationService.CorporationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/corporation")
public class CorporationController {
    @Autowired
    CorporationService corporationService;

    @GetMapping("/getCorporationDetail")
    public ResponseEntity<?> getCorporationDetail() {
        return ResponseEntity.ok(corporationService.getCorporationDetail());
    }
}
