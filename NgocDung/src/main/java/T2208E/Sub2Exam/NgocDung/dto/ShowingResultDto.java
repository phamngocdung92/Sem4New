package T2208E.Sub2Exam.NgocDung.dto;

import java.util.List;

public class ShowingResultDto extends PagingDto{
    private List content;
    private int totalPage;
    private int totalElement;

    public List getContent() {
        return content;
    }

    public void setContent(List content) {
        this.content = content;
    }

    @Override
    public int getTotalPage() {
        return totalPage;
    }

    @Override
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalElement() {
        return totalElement;
    }

    public void setTotalElement(int totalElement) {
        this.totalElement = totalElement;
    }
}
