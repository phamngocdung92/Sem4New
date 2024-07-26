package T2208E.Sub2Exam.NgocDung.dto;

//private Long UserId;
//private String userName;
//private String firstName;
//private String lastName;
//private String address;
//private Long departmentId;

public class UserDTO {
    private Long UserId;
    private String userName;
    private String firstName;
    private String lastName;
    private String address;
    private DepartmentDTO department;
    private CompanyDTO company;
    private CorporationDTO corporation;

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }

    public CorporationDTO getCorporation() {
        return corporation;
    }

    public void setCorporation(CorporationDTO corporation) {
        this.corporation = corporation;
    }
}
