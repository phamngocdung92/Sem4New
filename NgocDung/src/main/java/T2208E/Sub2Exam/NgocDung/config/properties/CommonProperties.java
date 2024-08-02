package T2208E.Sub2Exam.NgocDung.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Configuration
public class CommonProperties {
    @Value("${appConfig.default-page-size}")
    private int defaultPageSize;
    @Value("${appConfig.default-page-number}")
    private int defaultPageNumber;

    public int getDefaultPageSize() {
        return defaultPageSize;
    }

    public void setDefaultPageSize(int defaultPageSize) {
        this.defaultPageSize = defaultPageSize;
    }

    public int getDefaultPageNumber() {
        return defaultPageNumber;
    }

    public void setDefaultPageNumber(int defaultPageNumber) {
        this.defaultPageNumber = defaultPageNumber;
    }

    public String getHomeDirectory(){
        String desktopPath = System.getProperty("user.home") + File.separator +"Desktop";
        return desktopPath;
    }
    public String getDateExport(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }
}
