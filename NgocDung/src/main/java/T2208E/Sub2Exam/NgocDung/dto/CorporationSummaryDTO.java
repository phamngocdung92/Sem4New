package T2208E.Sub2Exam.NgocDung.dto;

public class CorporationSummaryDTO {
    private Long corporationId;
    private String corporationName;

    public CorporationSummaryDTO(Long corporationId, String corporationName) {
        this.corporationId = corporationId;
        this.corporationName = corporationName;
    }

    public Long getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Long corporationId) {
        this.corporationId = corporationId;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }
}
