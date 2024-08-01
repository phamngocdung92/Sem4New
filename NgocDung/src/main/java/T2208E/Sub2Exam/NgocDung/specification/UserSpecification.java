package T2208E.Sub2Exam.NgocDung.specification;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqUser.ReqSearchUserDto;
import T2208E.Sub2Exam.NgocDung.entity.UserEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import jakarta.persistence.criteria.Predicate;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserSpecification {
    public Specification<UserEntity> searchUser(ReqSearchUserDto criteria){
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if(!StringUtils.isEmpty(criteria.getUserId())){
                predicates.add(criteriaBuilder.equal(root.get("id"), criteria.getUserId()));
            }
            if (!StringUtils.isEmpty(criteria.getUsername())){
                predicates.add(criteriaBuilder.like(criteriaBuilder.upper(root.get("username")), "%" + criteria.getUsername().toUpperCase() + "%"));
            }
            if(!StringUtils.isEmpty(criteria.getAddress())){
                predicates.add(criteriaBuilder.like(criteriaBuilder.upper(root.get("address")), "%" + criteria.getAddress().toUpperCase() + "%"));
            }
            return criteriaBuilder.and(predicates.stream().toArray(Predicate[]::new));
        };
    }
}
