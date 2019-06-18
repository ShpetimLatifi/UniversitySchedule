import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MfSubjects {


    public List<String> firstYear() {
        List<String> subjects = new ArrayList<>();
        subjects.add("N.Braha - Analizë II");
        subjects.add("R.Gjergji - Algjebra II");
        subjects.add("B.Fejzullahu - Teori e gjasës I");
        subjects.add("F.Berisha - Hyrje në programim K");
        subjects.add("E.Fejza - Mikroekonomia");
        subjects.add("G.Bujupaj -Gjuhë angleze");
        subjects.add("E.Fejza - Menaxhimi I biznesit të vogël dhe të mesëm");
        Collections.shuffle(subjects);
        return subjects;
    }

    public List<String> secondYear() {
        List<String> subjects = new ArrayList<>();
        subjects.add("B.Fejzullahu - Analizë IV");
        subjects.add("E.Bajrami - Matematikë financiare");
        subjects.add("B.Baxhaku - Teori e gjasës II");
        subjects.add("E.Fejza - Menaxhimi bankar");
        subjects.add("S.Rexhepi - Kontabiliteti i institucioneve financiare ");
        subjects.add("S.Rexhepi - Analiza financiare");
        Collections.shuffle(subjects);
        return subjects;
    }

    public List<String> thirdYear() {
        List<String> subjects = new ArrayList<>();
        subjects.add("M.Gashi - Statistika me zbatim në biznes");
        subjects.add("E.Fejza - Menaxhimi i riskut dhe i sigurimeve");
        subjects.add("F.Merovci - Proceset stohastike II");
        subjects.add("E.Fejza - Marketing");
        subjects.add("S.Ahmeti - Auditimi");
        subjects.add("S.Rexhepi - Financat nderkombetare");
        subjects.add("B.Baxhaku - Ekonometri");
        Collections.shuffle(subjects);
        return subjects;
    }
}
