package T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqUser;

import T2208E.Sub2Exam.NgocDung.dto.PagingDto;
import T2208E.Sub2Exam.NgocDung.dto.ShowingResultDto;

public class ReqSearchUserDto extends ShowingResultDto {
    private String userId;
    private String username;
    private String address;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
