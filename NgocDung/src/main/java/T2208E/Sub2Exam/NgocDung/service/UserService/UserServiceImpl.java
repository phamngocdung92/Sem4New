package T2208E.Sub2Exam.NgocDung.service.UserService;

import T2208E.Sub2Exam.NgocDung.config.properties.CommonProperties;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqUser.ReqCreateUserDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqUser.ReqSearchUserDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqUser.ReqUpdateUserDto;
import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResUser.ResCreateUserDto;
import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResUser.ResSearchUserDto;
import T2208E.Sub2Exam.NgocDung.entity.CompanyEntity;
import T2208E.Sub2Exam.NgocDung.entity.CorporationEntity;
import T2208E.Sub2Exam.NgocDung.entity.DepartmentEntity;
import T2208E.Sub2Exam.NgocDung.entity.UserEntity;
import T2208E.Sub2Exam.NgocDung.repository.DepartmentRepository;
import T2208E.Sub2Exam.NgocDung.repository.UserRepository;
import T2208E.Sub2Exam.NgocDung.specification.UserSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    CommonProperties CommonProperties;
    @Autowired
    UserSpecification userSpecification;


    //get all user
    @Override
    public ResSearchUserDto getAllUser() {
        List<UserEntity> dataResult = userRepository.findAll();
        List<ResSearchUserDto> result = new ArrayList<>();
        for (UserEntity u : dataResult){
            result.add(getResSearchUserDto(u.getId(), u));
        }
        ResSearchUserDto showingResult = new ResSearchUserDto();
        showingResult.setContent(result);
        return showingResult;
    }

    //search user
    @Override
    public ResSearchUserDto searchUser(ReqSearchUserDto criteria) {
        if(criteria.getPageSize() <= 0 || criteria.getPageNumber() < 0){
            criteria.setPageNumber(CommonProperties.getDefaultPageNumber());
            criteria.setPageSize(CommonProperties.getDefaultPageSize());
        }
        Page<UserEntity> resData = userRepository.findAll(userSpecification.searchUser(criteria),
                        PageRequest.of(criteria.getPageNumber(),
                        criteria.getPageSize(),
                        Sort.by("id").ascending())
        );
        List<UserEntity> result = resData.getContent();
        List<ResSearchUserDto> resSearchUserDtos = new ArrayList<>();
        for (UserEntity u : result){
            resSearchUserDtos.add(getResSearchUserDto(u.getId(), u));
        }
        ResSearchUserDto showingResult = new ResSearchUserDto();
        showingResult.setContent(resSearchUserDtos);
        showingResult.setPageNumber(resData.getNumber());
        showingResult.setPageSize(resData.getSize());
        return showingResult;
    }


    private ResSearchUserDto getResSearchUserDto(long userId, UserEntity u) {
        ResSearchUserDto res = new ResSearchUserDto();
        res.setUserId(u.getId());
        res.setAddress(u.getAddress());
        res.setUsername(u.getUsername());
        DepartmentEntity department = u.getDepartment();
        res.setDepartmentName(department.getName());
        CompanyEntity company = department.getCompany();
        res.setCompanyName(company.getName());
        CorporationEntity corporation = company.getCorporation();
        res.setCorporationName(corporation.getName());
        return res;
    }
    //create user
    @Override
    public ResCreateUserDto createUser(ReqCreateUserDto inputDto) {
        try {
            UserEntity user = new UserEntity();
            user.setUsername(inputDto.getUsername());
            user.setAddress(inputDto.getAddress());
            user.setDepartment(departmentRepository.findById(inputDto.getDepartmentId()).get());
            userRepository.save(user);
            DepartmentEntity department = user.getDepartment();
            ResCreateUserDto res = new ResCreateUserDto();
            res.setUsername(user.getUsername());
            res.setAddress(user.getAddress());
            res.setDepartmentName(user.getDepartment().getName());
            res.setCompanyName(department.getCompany().getName());
            res.setCorporationName(department.getCompany().getCorporation().getName());
            res.setCreateResult("Create user success!");
            return res;
        }
        catch (Exception e) {
            e.printStackTrace();
            ResCreateUserDto res = new ResCreateUserDto();
            res.setCreateResult("Create user failed!");
            return res;
        }
    }

    //update user
    @Override
    public String updateUser(ReqUpdateUserDto inputDto, Long id) {
        String result = "";
        try {
            UserEntity user = userRepository.findById(id).get();
            user.setUsername(inputDto.getUsername());
            user.setAddress(inputDto.getAddress());
            user.setDepartment(departmentRepository.findById(inputDto.getDepartmentId()).get());
            userRepository.save(user);
            result = "Update user success!";
            return result;
        }
        catch (Exception e) {
            e.printStackTrace();
            result = "Update user failed!";
            return result;
        }
    }

    //delete user by id
    @Override
    public String deleteUser(Long id) {
        String result = "";
        try {
            String username = userRepository.findById(id).get().getUsername();
            if(username != null){
                userRepository.deleteById(id);
                result = "Delete user success!" + username;
            }
            return result;
        }
        catch (Exception e) {
            e.printStackTrace();
            result =  "Delete user failed!";
            return result;
        }
    }
}
