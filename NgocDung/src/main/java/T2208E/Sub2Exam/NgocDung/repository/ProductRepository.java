package T2208E.Sub2Exam.NgocDung.repository;

import T2208E.Sub2Exam.NgocDung.entity.ProductEntity;
import T2208E.Sub2Exam.NgocDung.entity.UserEntity;
import T2208E.Sub2Exam.NgocDung.specification.ProductSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>, JpaSpecificationExecutor<ProductEntity> {
}
