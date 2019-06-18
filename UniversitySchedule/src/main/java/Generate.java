import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.util.List;

public class Generate {

    public static void main(String[] args) throws Exception {
        Scheduler scheduler = new Scheduler();
        scheduler.schedule();
        List<List<String>> resultCs = scheduler.resultCs;
        List<List<String>> resultMt = scheduler.resultMt;
        List<List<String>> resultMf = scheduler.resultMf;


        String fileName = "C:\\Users\\shpet\\Desktop\\Result.xls";
        WritableWorkbook workbook = Workbook.createWorkbook(new File(fileName));
        WritableSheet sheet = workbook.createSheet("Res", 0);

        Label CS = new Label(1, 3, "CS");
        sheet.addCell(CS);
        int c = 4;
        for (List<String> years : resultCs) {
            int r = 1;
            for (String year : years) {
                Label cs = new Label(r, c, year);
                sheet.addCell(cs);
                r++;
            }
            c++;

        }
        Label Mf = new Label(1,12, "Mf");
        sheet.addCell(Mf);
        c = 13;
        for (List<String> years : resultMf) {
            int r = 1;
            for (String year : years) {
                Label mf = new Label(r, c, year);
                sheet.addCell(mf);
                r++;
            }
            c++;

        }
        Label M = new Label(1, 20, "M");
        sheet.addCell(M);
        c = 21;
        for (List<String> years : resultMt) {
            int r = 1;
            for (String year : years) {
                Label m = new Label(r, c, year);
                sheet.addCell(m);
                r++;
            }
            c++;

        }

        workbook.write();
        workbook.close();

    }
}
