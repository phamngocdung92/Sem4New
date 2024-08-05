package T2208E.Sub2Exam.NgocDung.specification;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqProduct.ReqSearchProductDto;
import T2208E.Sub2Exam.NgocDung.entity.ProductEntity;
import T2208E.Sub2Exam.NgocDung.entity.UserEntity;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductSpecification {
    public Specification<ProductEntity> searchProduct(ReqSearchProductDto criteria){
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if(!StringUtils.isEmpty(criteria.getId())){
                predicates.add(criteriaBuilder.equal(root.get("id"), criteria.getId()));
            }
            if (!StringUtils.isEmpty(criteria.getName())){
                predicates.add(criteriaBuilder.like(criteriaBuilder.upper(root.get("username")), "%" + criteria.getName().toUpperCase() + "%"));
            }
            if(!StringUtils.isEmpty(criteria.getManufacturerName())){
                predicates.add(criteriaBuilder.like(criteriaBuilder.upper(root.get("address")), "%" + criteria.getManufacturerName().toUpperCase() + "%"));
            }
            return criteriaBuilder.and(predicates.stream().toArray(Predicate[]::new));
        };
    }
}
