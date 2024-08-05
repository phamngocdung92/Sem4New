package T2208E.Sub2Exam.NgocDung.service.ProductService;

import T2208E.Sub2Exam.NgocDung.dto.ProductDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqProduct.ReqSearchProductDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqProduct.ReqUpdateProductDto;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    ProductDto getAllProduct();
    ProductDto searchProduct(ReqSearchProductDto criteria);
    ProductDto updateProduct(ReqUpdateProductDto inputDto, Long id);
    String deleteProduct(Long id);
}
