package T2208E.Sub2Exam.NgocDung.service.ProductService;

import T2208E.Sub2Exam.NgocDung.config.properties.CommonProperties;
import T2208E.Sub2Exam.NgocDung.dto.ProductDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqProduct.ReqSearchProductDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqProduct.ReqUpdateProductDto;
import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResUser.ResSearchUserDto;
import T2208E.Sub2Exam.NgocDung.entity.*;
import T2208E.Sub2Exam.NgocDung.repository.ProductRepository;
import T2208E.Sub2Exam.NgocDung.specification.ProductSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CommonProperties CommonProperties;
    @Autowired
    ProductSpecification productSpecification;

    @Override
    public ProductDto getAllProduct() {
        List<ProductEntity> productDtoList = productRepository.findAll();
        List<ProductDto> result = new ArrayList<>();
        for (ProductEntity p : productDtoList){
            result.add(getProductDto(p.getId(), p));
        }
        ProductDto showingResult = new ProductDto();
        showingResult.setContent(result);
        return showingResult;
    }
    private ProductDto getProductDto(Long id, ProductEntity p){
        ProductDto res = new ProductDto();
        res.setId(p.getId());
        res.setName(p.getName());
        res.setCategory(p.getCategory());
        res.setDescription(p.getDescription());
        res.setImageURL(p.getImageURL());
        res.setPrice(p.getPrice());
        res.setDiscount(p.getDiscount());
        res.setManufacturerId(p.getManufacturerId());
        res.setCreatedBy(p.getCreatedBy());
        res.setCreatedTime(p.getCreatedTime());
        res.setUpdatedBy(p.getUpdatedBy());
        res.setUpdatedTime(p.getUpdatedTime());
        return res;
    }

    @Override
    public ProductDto searchProduct(ReqSearchProductDto criteria) {
        if(criteria.getPageSize() <= 0 || criteria.getPageNumber() < 0){
            criteria.setPageNumber(CommonProperties.getDefaultPageNumber());
            criteria.setPageSize(CommonProperties.getDefaultPageSize());
        }
        Page<ProductEntity> resData = productRepository.findAll(productSpecification.searchProduct(criteria),
                PageRequest.of(criteria.getPageNumber(),
                        criteria.getPageSize(),
                        Sort.by("id").ascending())
        );
        List<ProductEntity> result = resData.getContent();
        List<ProductDto> res = new ArrayList<>();
        for (ProductEntity u : result){
            res.add(getResSearchProductDto(u.getId(), u));
        }
        ProductDto showingResult = new ProductDto();
        showingResult.setContent(res);
        showingResult.setPageNumber(resData.getNumber());
        showingResult.setPageSize(resData.getSize());
        return showingResult;
    }
    private ProductDto getResSearchProductDto(long Id, ProductEntity p){
        ProductDto res = new ProductDto();
        res.setId(p.getId());
        res.setName(p.getName());
        res.setCategory(p.getCategory());
        res.setDescription(p.getDescription());
        res.setImageURL(p.getImageURL());
        res.setPrice(p.getPrice());
        res.setDiscount(p.getDiscount());
        res.setManufacturerId(p.getManufacturerId());
        res.setCreatedBy(p.getCreatedBy());
        res.setCreatedTime(p.getCreatedTime());
        res.setUpdatedBy(p.getUpdatedBy());
        res.setUpdatedTime(p.getUpdatedTime());

        return res;
    }
    @Override
    public ProductDto updateProduct(ReqUpdateProductDto inputDto, Long id) {
        ProductEntity productEntity = productRepository.findById(id).get();
        productEntity.setName(inputDto.getName());
        productEntity.setCategory(inputDto.getCategory());
        productEntity.setDescription(inputDto.getDescription());
        productEntity.setImageURL(inputDto.getImageURL());
        productEntity.setPrice(inputDto.getPrice());
        productEntity.setDiscount(inputDto.getDiscount());
        productEntity.setManufacturerId(inputDto.getManufacturerId());
        productEntity.setUpdatedBy(inputDto.getUpdatedBy());
        productEntity.setUpdatedTime(inputDto.getUpdatedTime());
        productRepository.save(productEntity);
        return getProductDto(id, productEntity);
    }
    @Override
    public String deleteProduct(Long id) {
        ProductEntity p =  productRepository.findById(id).get();
        p.setStatus(0); //0 is deleted
        return "Delete success";
    }
}
