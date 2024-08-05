package T2208E.Sub2Exam.NgocDung.controller;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqProduct.ReqSearchProductDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqProduct.ReqUpdateProductDto;
import T2208E.Sub2Exam.NgocDung.service.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/getAllProduct")
    public ResponseEntity<?> getAllProduct() {
        return ResponseEntity.ok(productService.getAllProduct());
    }
    @PostMapping("/searchProduct")
    public ResponseEntity<?> searchProduct(@RequestBody ReqSearchProductDto criteria) {
        return ResponseEntity.ok(productService.searchProduct(criteria));
    }
    @PutMapping("/updateProduct")
    public ResponseEntity<?> updateProduct(@RequestBody ReqUpdateProductDto inputDto, Long id) {
        return ResponseEntity.ok(productService.updateProduct(inputDto, id));
    }
    @DeleteMapping("/deleteProduct")
    public ResponseEntity<?> deleteProduct(@RequestParam Long id) {
        return ResponseEntity.ok(productService.deleteProduct(id));
    }
}
