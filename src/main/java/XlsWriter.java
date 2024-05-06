import models.Statistics;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class XlsWriter {

   public static void writeXlsStatistics(List<Statistics> statisticsList, String filePath) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet statisticsSheet = workbook.createSheet("Statistics");

        XSSFCellStyle headerStyle = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeightInPoints((short) 15);
        headerStyle.setFont(font);

       int rowNumber = 0;
       Row headerRow = statisticsSheet.createRow(rowNumber++);
       Cell profileCellHeader = headerRow.createCell(0);
       profileCellHeader.setCellValue("Профиль обучения");
       profileCellHeader.setCellStyle(headerStyle);
       Cell avgScoreCellHeader = headerRow.createCell(1);
       avgScoreCellHeader.setCellValue("Средний балл за экзамены по профилю");
       avgScoreCellHeader.setCellStyle(headerStyle);
       Cell numberOfStudentsCellHeader = headerRow.createCell(2);
       numberOfStudentsCellHeader.setCellValue("Количество студентов по профилю");
       numberOfStudentsCellHeader.setCellStyle(headerStyle);
       Cell numberOfUniversitiesCellHeader = headerRow.createCell(3);
       numberOfUniversitiesCellHeader.setCellValue("Количество университетов по профилю");
       numberOfUniversitiesCellHeader.setCellStyle(headerStyle);
       Cell universitiesCellHeader = headerRow.createCell(4);
       universitiesCellHeader.setCellValue("Университеты");
       universitiesCellHeader.setCellStyle(headerStyle);

       for (Statistics statistics : statisticsList) {
           Row dataRow = statisticsSheet.createRow(rowNumber++);
           Cell profileCell = dataRow.createCell(0);
           profileCell.setCellValue(statistics.getProfile().getProfileName());
           Cell avgScoreCell = dataRow.createCell(1);
           avgScoreCell.setCellValue(statistics.getAvgExamScore());
           Cell numberOfStudentsCell = dataRow.createCell(2);
           numberOfStudentsCell.setCellValue(statistics.getNumberOfStudents());
           Cell numberOfUniversitiesCell = dataRow.createCell(3);
           numberOfUniversitiesCell.setCellValue(statistics.getNumberOfUniversities());
           Cell universitiesCell = dataRow.createCell(4);
           universitiesCell.setCellValue(statistics.getUniversityNames());
       }

       try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
           workbook.write(outputStream);
       }

   }


}
