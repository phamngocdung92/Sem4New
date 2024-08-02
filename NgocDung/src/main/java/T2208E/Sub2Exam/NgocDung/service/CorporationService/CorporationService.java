package T2208E.Sub2Exam.NgocDung.service.CorporationService;

import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResCorporation.ResGetCorpDetail;
import org.springframework.stereotype.Service;

@Service
public interface CorporationService {
    ResGetCorpDetail getCorporationDetail();
}
